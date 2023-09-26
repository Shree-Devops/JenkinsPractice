package package2;

public class DriverManagerFactory {
	DriverManager drivermanager;
	
	public DriverManager getDriverManager(String driver) {
		if(driver.equalsIgnoreCase("chrome"))
			drivermanager = new ChromeDriverManager();
		else if(driver.equalsIgnoreCase("firefox"))
			drivermanager = new FirefoxDriverManager();
		else if(driver.equalsIgnoreCase("chromewithcapabilities"))
			drivermanager = new ChromeDriverManagerCapabilities();
		else if(driver.equalsIgnoreCase("firefoxwithcapabilities"))
			drivermanager = new FirefoxDriverManagerCapability();
		return drivermanager;
	}

}
