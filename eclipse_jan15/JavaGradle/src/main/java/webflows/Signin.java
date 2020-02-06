package webflows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signin  {
	
	WebDriver driver;
	
	By Email = By.id("//*[@id='email']");
	
	By Password = By.id("//*[@id='password']");
	
	
	@SuppressWarnings("static-access")
	By Signin = By.xpath("//input[@type='submit']").linkText("Sign In");
	
	@SuppressWarnings("static-access")
	By Clear= By.xpath("//input[@type='button']").partialLinkText("Clear");
	
	
}
