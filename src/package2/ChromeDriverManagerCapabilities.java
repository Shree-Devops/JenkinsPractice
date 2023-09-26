package package2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverManagerCapabilities extends DriverManager{

	@Override
	public void createDriver() {
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\ShreeMohini_Baghel\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");
		
		DesiredCapabilities capabilities = new DesiredCapabilities ();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(options);
	}

}
