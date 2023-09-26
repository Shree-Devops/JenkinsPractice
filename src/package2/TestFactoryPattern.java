package package2;

import org.openqa.selenium.WebDriver;

public class TestFactoryPattern {
	WebDriver driver;
	DriverManager dm;
	public static void main (String[] args) {
		TestFactoryPattern tf = new TestFactoryPattern();
		DriverManagerFactory managerfactory = new DriverManagerFactory();
		tf.dm = managerfactory.getDriverManager("chrome");
		tf.driver = tf.dm.getDriver();
		tf.driver.get("http://google.com");
		tf.dm = managerfactory.getDriverManager("chromewithcapabilities");
		tf.driver = tf.dm.getDriver();
		tf.driver.get("http://yahoo.com");
	}
}






