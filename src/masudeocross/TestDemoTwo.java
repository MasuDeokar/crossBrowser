package masudeocross;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemoTwo {

	@SuppressWarnings("deprecation")
	@Test 
	public void titleCheckGit() throws MalformedURLException
	{
		MutableCapabilities caps = new MutableCapabilities();
		//WebDriver driver = new RemoteWebDriver(new URL("http://hub.browserstack.com/wd/hub"), caps);
		WebDriver driver = new RemoteWebDriver(new URL("https://mayureshdeokar_5Geiga:8PhvyppcqpyMH5DzpFpr@hub-cloud.browserstack.com/wd/hub"), caps);
		driver.get("https://github.com/");
		Assert.assertTrue(driver.getTitle().matches("GitHub: Let’s build from here · GitHub"));
		
	}



}
