package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
	@Test
	public void test2() throws MalformedURLException {
//		DesiredCapabilities dc = DesiredCapabilities.chrome();
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		driver.get("https://www.google.com/");
		System.out.println("WebPage Title firefox: "+driver.getTitle());
		driver.close();
//
//		System.setProperty("webdriver.chrome.driver","D:\\Recover\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
//		FirefoxOptions options = new FirefoxOptions();
//		options.addArguments("--headless");
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//		options.merge(capabilities);
//		FirefoxDriver driver = new FirefoxDriver(options);		
//		driver.get("http://www.google.com/");
//		driver.manage().window().maximize();
//		String title = driver.getTitle();
//		System.out.println("Page Title: " +title);
//		driver.quit();
	}
}
