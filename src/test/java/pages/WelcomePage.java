package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WelcomePage {
	
	private static String Welcome_Page_Login_Button_linktext = "Log in";

	private WebDriver driver;
	
	public WelcomePage(WebDriver driver){
		this.driver=driver;
	}
	
	public void LogIn_Click(){
		driver.findElement(By.linkText(Welcome_Page_Login_Button_linktext)).click();
	}
	
}
