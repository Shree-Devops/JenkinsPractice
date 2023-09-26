package package2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{

	@Override
	public void createDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ShreeMohini_Baghel\\Downloads\\geckodriver-v0.33.0-win64.zip\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
}
