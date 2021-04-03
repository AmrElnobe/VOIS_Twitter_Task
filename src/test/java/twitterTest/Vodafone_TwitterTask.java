package twitterTest;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import configurations.Config;
import io.github.bonigarcia.wdm.WebDriverManager;

import pages.WelcomePage;
import pages.LoginPage;
import pages.HomePage;


public class Vodafone_TwitterTask {

	public static String username;
	public static String password;
	public static String TweetLessThan280Character;
	public static String TweetMoreThan280Character;
	public static String PollQuestion;
	public static String PollChoice1;
	public static String PollChoice2;
	public static String ConsecutiveIdenticalTweet;
	public static String GIFText;

	
	private static WebDriver driver ;	
	boolean IsErrorMessageDisplayed;
	String TweetButton_Status;
	String MediaButton_Status;	

	static ExtentHtmlReporter report = new ExtentHtmlReporter("Report.html");
	static ExtentReports extent = new ExtentReports();
	
	


	@BeforeMethod
	public void setUp(){


		extent.attachReporter(report);
		ExtentTest PreTest = extent.createTest("PreCondition","The preconditions of each test is runned here");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);

		try {
			PreTest.info("Opening Chrome Browser");
			driver.get("http://twitter.com");
			PreTest.pass("Opening Browser Passed");


			PreTest.info("Maximizing Chrome Browser");
			driver.manage().window().maximize();
			PreTest.pass("Maximizing Browser Passed");


			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			PreTest.info("Clicking on Login Button");
			welcome.LogIn_Click();
			PreTest.pass("Clicking on Login Button Passed");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			Config.Read_Username();
			Config.Read_Password();

			PreTest.info("Entering Username & Password");
			login.Enter_Username(username);	
			login.Enter_Password(password);
			PreTest.pass("Entering Username & Password Passed");

			PreTest.info("Clicking on Login Button");
			login.LogIn_Click();
			PreTest.pass("Clicking on Login Button Passed");
		}

		catch(Exception e)
		{
			PreTest.fail("Preconditions Failed");
		}

		extent.flush();


	}





	@Test
	public void Tweet_Text_LessThan_or_Equal_Positive() {
		extent.attachReporter(report);
		ExtentTest Test1 = extent.createTest("Tweet Positive senario ","Tweet less or equal 280 character");

		try {
		HomePage home = new HomePage(driver);
		Config.Read_TweetLessThan280Character();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		home.Tweet_Text(TweetLessThan280Character);
		Test1.pass("Writing tweet less than or equal 280 character Passed");
		home.TweetButtonP_Click();
		Test1.pass("Clicking on Tweet Button Passed");
		IsErrorMessageDisplayed = home.ErrorMessage_TwoIdenticalTweets_IsDisplayed();
		if(IsErrorMessageDisplayed) Test1.fail("Tweet is already found");
		else Test1.pass("Tweet is posted successfully");
		Assert.assertFalse(IsErrorMessageDisplayed);
		}
		catch(Exception e)
		{
			Test1.fail("Tweet Positive senario Failed");
		}
	}

	@Test
	public void Tweet_Text_MoreThan_Negative() {
		extent.attachReporter(report);
		ExtentTest Test2 = extent.createTest("Tweet Negative senario ","Tweet more than 280 character");

		try {
		HomePage home = new HomePage(driver);
		Config.Read_TweetMoreThan280Character();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		home.Tweet_Text(TweetMoreThan280Character);
		Test2.pass("Writing tweet more than 280 character Passed");
		TweetButton_Status = home.TweetButtonN_Status();
		Assert.assertEquals(TweetButton_Status, "true");
		Test2.pass("Clicking on Tweet Button Passed");
		} 
		catch(Exception e)
		{
			Test2.fail("Tweet Negative senario Failed");
		}
	}


	@Test	
	public void Tweet_Poll_Positive() {
		extent.attachReporter(report);
		ExtentTest Test3 = extent.createTest("Poll Positive senario ","Tweet poll");

		try {
		HomePage home = new HomePage(driver);
		Config.Read_PollQuestion();
		Config.Read_PollChoice1();
		Config.Read_PollChoice2();
		home.PollButton_Click();
		Test3.pass("Clicking on Poll Button Passed");
		home.Tweet_Poll(PollChoice1, PollChoice2, PollQuestion);
		Test3.pass("Writing Poll textbox fields");
		home.TweetButtonP_Click();
		Test3.pass("Clicking on Tweet Button Passed");
		}
		catch(Exception e)
		{
			Test3.fail("Poll Positive senario Failed");
		}

	}

	@Test	
	public void Tweet_TwoConsecutiveIdenticalTweets_Negative() {
		extent.attachReporter(report);
		ExtentTest Test4 = extent.createTest("Tweet Negative senario ","Tweet Two Consecutive Identical Tweets");
		
		try {
		HomePage home = new HomePage(driver);
		Config.Read_ConsecutiveIdenticalTweet();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		home.Tweet_Text(ConsecutiveIdenticalTweet);
		Test4.pass("Write the first tweet");
		home.TweetButtonP_Click();
		Test4.pass("Clicking on Tweet Button Passed");
		home.Tweet_Text(ConsecutiveIdenticalTweet);
		Test4.pass("Write the second tweet");
		home.TweetButtonP_Click();
		Test4.pass("Clicking on Tweet Button Passed");
		IsErrorMessageDisplayed = home.ErrorMessage_TwoIdenticalTweets_IsDisplayed();
		Assert.assertTrue(IsErrorMessageDisplayed);
		Test4.pass("Check tweet button is dimmed");
		}
		catch(Exception e)
		{
			Test4.fail("Tweet Negative senario Failed");
		}

	}

	@Test	
	public void Tweet_GIF_Positive() {
		extent.attachReporter(report);
		ExtentTest Test5 = extent.createTest("GIF Positive senario ","Tweet a GIF");
		
		try {
		HomePage home = new HomePage(driver);
		Config.Read_GIFText();
		home.GIFButton_Click();
		Test5.pass("Clicking on GIF Button Passed");
		home.Tweet_GIF(GIFText);
		Test5.pass("Search for GIF Passed");
		home.TweetButtonP_Click();
		Test5.pass("Choose GIF Passed");
		}
		catch(Exception e)
		{
			Test5.fail("GIF Positive senario Failed");
		}
	}

	@Test	
	public void Tweet_GIF_Negative() {

		extent.attachReporter(report);
		ExtentTest Test6 = extent.createTest("GIF Negative senario ","Choose photo while choosing GIF ");
		
		try {
		HomePage home = new HomePage(driver);
		Config.Read_GIFText();
		home.GIFButton_Click();
		Test6.pass("Clicking on GIF Button Passed");
		home.Tweet_GIF(GIFText);
		Test6.pass("Search for GIF Passed");
		MediaButton_Status = home.Media_Status();
		Assert.assertEquals(MediaButton_Status, "true");
		Test6.pass("Check Picture button is dimmed");
		}
		catch(Exception e)
		{
			Test6.fail("GIF Negative senario Failed");
		}
	}


	@AfterMethod
	public static void teardown()
	{
		extent.attachReporter(report);
		ExtentTest PostTest = extent.createTest("PostCondition","The postconditions of each test is runned here");
		try {
			Thread.sleep(8000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			PostTest.fail("Postconditions Failed");
		}
		try {
			String x = getScreenshot(driver);
			PostTest.addScreenCaptureFromPath(x);
			PostTest.pass("Screenshot added to the report");
		} catch (IOException e) {
			e.printStackTrace();
			PostTest.fail("Screenshot failed to be added to the report");
		}
		driver.close();
	}
	
	public static String getScreenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
		
		File destination=new File(path);
		
		try 
		{
			FileUtils.copyFile(src, destination);
		} catch (IOException e) 
		{
			System.out.println("Capture Failed "+e.getMessage());
		}
		
		return path;
	}

}
