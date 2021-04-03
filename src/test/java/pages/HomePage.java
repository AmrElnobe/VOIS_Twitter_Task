package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private static String Home_Page_Tweetbox_xpath = "/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div";
	
	private static String Home_Page_TweetButtonP_css = "#react-root > div > div > div.css-1dbjc4n.r-18u37iz.r-13qz1uu.r-417010 > main > div > div > div > div > div > div.css-1dbjc4n.r-14lw9ot.r-184en5c > div > div.css-1dbjc4n.r-14lw9ot.r-oyd9sg > div:nth-child(1) > div > div > div > div.css-1dbjc4n.r-1iusvr4.r-16y2uox.r-1777fci.r-1h8ys4a.r-1bylmt5.r-13tjlyg.r-7qyjyx.r-1ftll1t > div:nth-child(4) > div > div > div:nth-child(2) > div.css-18t94o4.css-1dbjc4n.r-urgr8i.r-42olwf.r-sdzlij.r-1phboty.r-rs99b7.r-1w2pmg.r-19u6a5r.r-ero68b.r-1gg2371.r-1ny4l3l.r-1fneopy.r-o7ynqc.r-6416eg.r-lrvibr > div > span > span";
	private static String Home_Page_TweetButtonN_css = "#react-root > div > div > div.css-1dbjc4n.r-18u37iz.r-13qz1uu.r-417010 > main > div > div > div > div > div > div.css-1dbjc4n.r-14lw9ot.r-184en5c > div > div.css-1dbjc4n.r-14lw9ot.r-oyd9sg > div:nth-child(1) > div > div > div > div.css-1dbjc4n.r-1iusvr4.r-16y2uox.r-1777fci.r-1h8ys4a.r-1bylmt5.r-13tjlyg.r-7qyjyx.r-1ftll1t > div:nth-child(4) > div > div > div:nth-child(2) > div.css-1dbjc4n.r-urgr8i.r-42olwf.r-sdzlij.r-1phboty.r-rs99b7.r-1w2pmg.r-19u6a5r.r-ero68b.r-1gg2371.r-icoktb.r-1ny4l3l.r-1fneopy.r-o7ynqc.r-6416eg.r-lrvibr";

	private static String Home_Page_MediaButton_css = "#react-root > div > div > div.css-1dbjc4n.r-18u37iz.r-13qz1uu.r-417010 > main > div > div > div > div.css-1dbjc4n.r-14lw9ot.r-1gm7m50.r-1ljd8xs.r-13l2t4g.r-1phboty.r-1jgb5lz.r-11wrixw.r-61z16t.r-1ye8kvj.r-13qz1uu.r-184en5c > div > div.css-1dbjc4n.r-14lw9ot.r-184en5c > div > div.css-1dbjc4n.r-14lw9ot.r-oyd9sg > div:nth-child(1) > div > div > div > div.css-1dbjc4n.r-1iusvr4.r-16y2uox.r-1777fci.r-1h8ys4a.r-1bylmt5.r-13tjlyg.r-7qyjyx.r-1ftll1t > div:nth-child(4) > div > div > div:nth-child(1) > div.css-1dbjc4n.r-1niwhzg.r-42olwf.r-sdzlij.r-1phboty.r-rs99b7.r-1w2pmg.r-5vhgbc.r-mvpalk.r-4mshu.r-ero68b.r-vkv6oe.r-icoktb.r-1ny4l3l.r-mk0yit.r-o7ynqc.r-6416eg.r-lrvibr";
	
	private static String Home_Page_GIFButton_css = "#react-root > div > div > div.css-1dbjc4n.r-18u37iz.r-13qz1uu.r-417010 > main > div > div > div > div > div > div.css-1dbjc4n.r-14lw9ot.r-184en5c > div > div.css-1dbjc4n.r-14lw9ot.r-oyd9sg > div:nth-child(1) > div > div > div > div.css-1dbjc4n.r-1iusvr4.r-16y2uox.r-1777fci.r-1h8ys4a.r-1bylmt5.r-13tjlyg.r-7qyjyx.r-1ftll1t > div:nth-child(2) > div > div > div:nth-child(1) > div:nth-child(3) > div > svg";
	private static String Home_Page_GIFSearchText_css = "#layers > div:nth-child(2) > div > div > div > div > div > div.css-1dbjc4n.r-1habvwh.r-18u37iz.r-1pi2tsx.r-1777fci.r-1xcajam.r-ipm5af.r-g6jmlv > div.css-1dbjc4n.r-1867qdf.r-1wbh5a2.r-kwpbio.r-rsyp9y.r-1pjcn9w.r-1279nm1.r-htvplk.r-1udh08x.r-1potc6q > div > div.css-1dbjc4n.r-1h3ijdo.r-136ojw6 > div > div > div > div.css-1dbjc4n.r-16y2uox.r-1wbh5a2.r-1pi2tsx.r-1777fci > div.css-1dbjc4n.r-1awozwy.r-13awgt0.r-18u37iz.r-c8eef1 > div > div > div.css-901oao.r-18jsvk2.r-6koalj.r-16y2uox.r-1qd0xha.r-a023e6.r-16dba41.r-rjixqe.r-bcqeeo.r-qvutc0 > input";
	private static String Home_Page_GIFSearchButton_css = "#layers > div:nth-child(2) > div > div > div > div > div > div.css-1dbjc4n.r-1habvwh.r-18u37iz.r-1pi2tsx.r-1777fci.r-1xcajam.r-ipm5af.r-g6jmlv > div.css-1dbjc4n.r-1867qdf.r-1wbh5a2.r-kwpbio.r-rsyp9y.r-1pjcn9w.r-1279nm1.r-htvplk.r-1udh08x.r-1potc6q > div > div.css-1dbjc4n.r-16y2uox.r-1wbh5a2.r-1jgb5lz.r-1ye8kvj.r-13qz1uu > div > div:nth-child(2) > div > div:nth-child(1) > div > div.css-18t94o4.css-1dbjc4n.r-b5skir.r-1wbh5a2.r-ah43r1.r-1hoetue.r-1ny4l3l.r-1udh08x.r-o7ynqc.r-6416eg.r-aq59uc > div > img";
	
	private static String Home_Page_Poll_Button_css = "#react-root > div > div > div.css-1dbjc4n.r-18u37iz.r-13qz1uu.r-417010 > main > div > div > div > div > div > div.css-1dbjc4n.r-14lw9ot.r-184en5c > div > div.css-1dbjc4n.r-14lw9ot.r-oyd9sg > div:nth-child(1) > div > div > div > div.css-1dbjc4n.r-1iusvr4.r-16y2uox.r-1777fci.r-1h8ys4a.r-1bylmt5.r-13tjlyg.r-7qyjyx.r-1ftll1t > div:nth-child(2) > div > div > div:nth-child(1) > div:nth-child(4) > div > svg";
	private static String Home_Page_Poll_Choice1_Text_css = "#react-root > div > div > div.css-1dbjc4n.r-18u37iz.r-13qz1uu.r-417010 > main > div > div > div > div > div > div.css-1dbjc4n.r-14lw9ot.r-184en5c > div > div.css-1dbjc4n.r-14lw9ot.r-oyd9sg > div:nth-child(1) > div > div > div > div.css-1dbjc4n.r-1iusvr4.r-16y2uox.r-1777fci.r-1h8ys4a.r-1bylmt5.r-13tjlyg.r-7qyjyx.r-1ftll1t > div.css-1dbjc4n.r-184en5c > div > div > div > div > div > div > div > div > div.css-1dbjc4n.r-15zivkp.r-14gqq1x.r-184en5c > div > div.css-1dbjc4n.r-18u37iz.r-1qhn6m8.r-i023vh > div.css-1dbjc4n.r-16y2uox.r-1wbh5a2.r-1d4mawv > div:nth-child(1) > div > label > div > div.css-1dbjc4n.r-18u37iz.r-16y2uox.r-1wbh5a2.r-1wzrnnt.r-1udh08x.r-iphfwy.r-s1qlax.r-ttdzmv > div > input";                                                                                                                                                                                                                                                                                              
	private static String Home_Page_Poll_Choice2_Text_css = "#react-root > div > div > div.css-1dbjc4n.r-18u37iz.r-13qz1uu.r-417010 > main > div > div > div > div > div > div.css-1dbjc4n.r-14lw9ot.r-184en5c > div > div.css-1dbjc4n.r-14lw9ot.r-oyd9sg > div:nth-child(1) > div > div > div > div.css-1dbjc4n.r-1iusvr4.r-16y2uox.r-1777fci.r-1h8ys4a.r-1bylmt5.r-13tjlyg.r-7qyjyx.r-1ftll1t > div.css-1dbjc4n.r-184en5c > div > div > div > div > div > div > div > div > div.css-1dbjc4n.r-15zivkp.r-14gqq1x.r-184en5c > div > div.css-1dbjc4n.r-18u37iz.r-1qhn6m8.r-i023vh > div.css-1dbjc4n.r-16y2uox.r-1wbh5a2.r-1d4mawv > div:nth-child(2) > div > label > div > div.css-1dbjc4n.r-18u37iz.r-16y2uox.r-1wbh5a2.r-1wzrnnt.r-1udh08x.r-iphfwy.r-s1qlax.r-ttdzmv > div > input";                                                             
	private static String Home_Page_Poll_Question_Text_css = "#react-root > div > div > div.css-1dbjc4n.r-18u37iz.r-13qz1uu.r-417010 > main > div > div > div > div > div > div.css-1dbjc4n.r-14lw9ot.r-184en5c > div > div.css-1dbjc4n.r-14lw9ot.r-oyd9sg > div:nth-child(1) > div > div > div > div.css-1dbjc4n.r-1iusvr4.r-16y2uox.r-1777fci.r-1h8ys4a.r-1bylmt5.r-13tjlyg.r-7qyjyx.r-1ftll1t > div.css-1dbjc4n.r-184en5c > div > div > div > div > div > div > div > div > div.css-1dbjc4n.r-18u37iz > div.css-901oao.r-18jsvk2.r-6koalj.r-16y2uox.r-1qd0xha.r-adyw6z.r-16dba41.r-135wba7.r-bcqeeo.r-qvutc0 > div > div > div > div.DraftEditor-editorContainer > div > div > div > div";
	
	private static String Home_Page_TwoConseutiveIdenticalTweets_ErrorMessage_css = "#react-root > div > div > div.css-1dbjc4n.r-18u37iz.r-13qz1uu.r-417010 > main > div > div > div > div > div > div.css-1dbjc4n.r-14lw9ot.r-184en5c > div > div.css-1dbjc4n.r-ymttw5.r-1f1sjgu > div";
	
	private WebDriver driver;
	private int TweetLength;
	
	public HomePage(WebDriver driver){
		this.driver=driver;

	}
	
	public int Tweet_Text(String Tweet){
		TweetLength = Tweet.length();
		driver.findElement(By.xpath(Home_Page_Tweetbox_xpath)).click();
		driver.findElement(By.xpath(Home_Page_Tweetbox_xpath)).clear();
		driver.findElement(By.xpath(Home_Page_Tweetbox_xpath)).sendKeys(Tweet);
		return TweetLength;
	}
	
	public void TweetButtonP_Click(){
		driver.findElement(By.cssSelector(Home_Page_TweetButtonP_css)).click();
	}
	
	public void TweetButtonN_Click(){
		driver.findElement(By.cssSelector(Home_Page_TweetButtonN_css)).click();
	}
	
	public void TweetButtonP_Status(){
		System.out.println(driver.findElement(By.cssSelector(Home_Page_TweetButtonP_css)).isEnabled());
	}
	
	public String TweetButtonN_Status(){
		return driver.findElement(By.cssSelector(Home_Page_TweetButtonN_css)).getAttribute("aria-disabled");
	}

	public String Media_Status(){
		return driver.findElement(By.cssSelector(Home_Page_MediaButton_css)).getAttribute("aria-disabled");
	}
	
	public void GIFButton_Click() {
		driver.findElement(By.cssSelector(Home_Page_GIFButton_css)).click();
	}
	
	public void Tweet_GIF(String GIF_Name) {
		driver.findElement(By.cssSelector(Home_Page_GIFSearchText_css)).sendKeys(GIF_Name);
		driver.findElement(By.cssSelector(Home_Page_GIFSearchButton_css)).click();
	}
	
	public void PollButton_Click() {
		driver.findElement(By.cssSelector(Home_Page_Poll_Button_css)).click();
	}
	
	public void Tweet_Poll(String Choice1, String Choice2, String Question) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(Home_Page_Poll_Choice1_Text_css)).sendKeys(Choice1);
		driver.findElement(By.cssSelector(Home_Page_Poll_Choice2_Text_css)).sendKeys(Choice2);
		driver.findElement(By.cssSelector(Home_Page_Poll_Question_Text_css)).sendKeys(Question);

	}
	
	public boolean ErrorMessage_TwoIdenticalTweets_IsDisplayed() {
		try {
		return driver.findElement(By.cssSelector(Home_Page_TwoConseutiveIdenticalTweets_ErrorMessage_css)).isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	
}
