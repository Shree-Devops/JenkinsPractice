package package2;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

	public WebDriver driver;
	public abstract void createDriver();
	public WebDriver getDriver() {
        if (null == driver) {
            createDriver();
        }
        return driver;
    }

}
