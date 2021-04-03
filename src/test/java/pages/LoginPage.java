package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private static String Login_Page_Username_TextBox_xpath = "/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[1]/label/div/div[2]/div/input";
	private static String Login_Page_Password_TextBox_xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[2]/form/div/div[2]/label/div/div[2]/div/input";
	private static String Login_Page_Login_Button_xpath = "/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[3]/div/div/span/span";

	private WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;

	}
	
	public void Enter_Username(String Username){
		driver.findElement(By.xpath(Login_Page_Username_TextBox_xpath)).click();
		driver.findElement(By.xpath(Login_Page_Username_TextBox_xpath)).clear();
		driver.findElement(By.xpath(Login_Page_Username_TextBox_xpath)).sendKeys(Username);
	}
	
	public void Enter_Password(String Password){
		driver.findElement(By.xpath(Login_Page_Password_TextBox_xpath)).click();
		driver.findElement(By.xpath(Login_Page_Password_TextBox_xpath)).clear();
		driver.findElement(By.xpath(Login_Page_Password_TextBox_xpath)).sendKeys(Password);
	}
	
	public void LogIn_Click(){
		driver.findElement(By.xpath(Login_Page_Login_Button_xpath)).click();
	}
	

	
	
}
