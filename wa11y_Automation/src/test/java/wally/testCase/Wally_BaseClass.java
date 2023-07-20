package wally.testCase;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import wally.utilities.ReadConfig;

public class Wally_BaseClass {
	ReadConfig rconfig = new ReadConfig();
	public static WebDriver driver;
	public String url= rconfig.getappurl();
	public String emailid1 = rconfig.getemail();
	public String password = rconfig.getpasscode();

	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser) {
		// ----one way of setting up the driver if the driver is in projectlevel
		// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		// + "//Driver//chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\FleetStudio-19\\Downloads\\chromedriver_win32\\chromedriver.exe");
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--allow-running-insecure-content");
		prefs.put("profile.default_content_settings.geolocation", false);
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("Chrome");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		capabilities.setVersion("ANY");
		capabilities.setPlatform(Platform.WINDOWS);
		driver = new ChromeDriver(options);
		}
		else if(browser.equals("firefox")) {
			
		}
		else if(browser.equals("ie"))
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Maximizes the browser window
		driver.manage().window().maximize();
		driver.get(url);

	}

	@AfterClass
	public void tearDown() {
		//driver.close();
	}

}
