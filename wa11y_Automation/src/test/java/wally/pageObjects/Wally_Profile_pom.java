package wally.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wally_Profile_pom {
	WebDriver driver;

	public Wally_Profile_pom(WebDriver pro_driver) {
		driver = pro_driver;
		PageFactory.initElements(pro_driver, this);
	}
	// ----------------------Locator information------------------------------//

	// profile icon xpath
	@FindBy(xpath = "//span[@class='group-hover:text-gold sidebar_element text-white']")
	WebElement profile_icon;
	// first name locator
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement f_name;
	// last name locator
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement l_name;
	// phone number locator
	@FindBy(xpath = "//input[@class='PhoneInputInput']")
	WebElement ph_number;
	// save button locator
	@FindBy(xpath = "(//button[@type='submit']//span[text()='SAVE'])[1]")
	WebElement save_button;

	// action method for profile icon click
	public void user_profile() {
		profile_icon.click();
	}

	// action method for profile first name 
	public void profile_firstname() {
		f_name.clear();
		f_name.sendKeys("siva");
	}

	// action method for profile last name
	public void profile_lastname() {
		l_name.clear();
		l_name.sendKeys("kumar");
	}
	
	public void profile_phone() {
		l_name.clear();
		l_name.sendKeys("9047494895");
	}

	// -----------------------Action field information-------------------------//

}
