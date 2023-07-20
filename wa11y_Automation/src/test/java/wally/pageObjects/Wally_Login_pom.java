package wally.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wally_Login_pom {
	WebDriver driver;

	public Wally_Login_pom(WebDriver rem_driver) {
		driver = rem_driver;
		PageFactory.initElements(rem_driver, this);
	}
	// ----------------------Locator information------------------------------//

	// Email id locator using ID
	@FindBy(id = "username")
	WebElement emailid;
	// password locator
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	// sign in button locator
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement submit;

	// action method for email field
	public void user_emailid(String email) {
		emailid.sendKeys(email);
	}

	// -----------------------Action field information-------------------------//

	// action method for password field
	public void password(String passcode) {
		password.sendKeys(passcode);
	}

	// action method for submit button
	public void submit() {
		submit.click();
	}
}
