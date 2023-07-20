package wally.pageObjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wally_Website_pom {
	WebDriver driver;

	public Wally_Website_pom(WebDriver web_driver) {
		driver = web_driver;
		PageFactory.initElements(web_driver, this);
	}

	// ----------------------Locator----------------
	//adding new website 
	@FindBy(xpath = "//button[text()='ADD NEW WEBSITE']")
	WebElement add_new;
	//domain addition input field 
	@FindBy(xpath = "//input[@id='url']")
	WebElement url;
	//error validation 
	@FindBy(xpath = "//p[text()='Given website domain already exists']")
	WebElement errortext;
	//close button 
	@FindBy(xpath = "//span[text()='Close']")
	WebElement close;
	// website click
	@FindBy(xpath = "//h3[text()='zoho']")
	WebElement website;
	//view audit report 
	@FindBy(xpath = "//p[text()='VIEW AUDIT REPORT']")
	WebElement view_report;
	//audit detail 
	@FindBy(xpath = "//div[contains(@class,'flex-none lg:flex items-center justify-between mb-1')]")
	WebElement rule_failure;
	//Add new website action 
	public void add_new_web() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(add_new));
		add_new.click();
	}
	public void domain() {
		url.sendKeys("fred.com");
		url.sendKeys(Keys.ENTER);
		close.click();
		/*
		 * String error = "Given website domain already exists";
		 * if(errortext.getText().equals(error)){
		 * System.out.println("Website not added successfully");
		 * 
		 * }
		 */
		
	}
	
	// clicking on the zoho website
	public void website() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(website));
		website.click();
	}
	//rule failure detail 
	public void rule() {
		
	}
	//Ax score verification
	public void view_audit() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(view_report));
		view_report.click();
		
	}
	
}
