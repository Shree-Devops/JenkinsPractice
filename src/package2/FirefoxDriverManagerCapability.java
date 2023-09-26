package package2;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxDriverManagerCapability extends DriverManager{

	@Override
	public void createDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ShreeMohini_Baghel\\Downloads\\geckodriver-v0.33.0-win64.zip\\geckodriver.exe");
		
		DesiredCapabilities capabilities = new DesiredCapabilities ();
		FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
        driver = new FirefoxDriver(options);
	}

}
