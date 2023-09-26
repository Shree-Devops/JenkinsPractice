package package2;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{

	@Override
	public void createDriver() {
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\ShreeMohini_Baghel\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}

}
