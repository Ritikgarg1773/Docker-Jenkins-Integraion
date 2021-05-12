package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	@Test
	public void test1() throws MalformedURLException {
//		DesiredCapabilities dc = DesiredCapabilities.chrome();
//		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
////		DesiredCapabilities dc = DesiredCapabilities.firefox();
//		URL url = new URL("http://localhost:4444/wd/hub");
//		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
//		driver.get("https://google.com/");
//		System.out.println("WebPage Title chrome: "+driver.getTitle());
//		driver.close();
		// The above code was giving error
		// refer to https://stackoverflow.com/questions/53073411/selenium-webdriverexceptionchrome-failed-to-start-crashed-as-google-chrome-is
		//corrected and referenced from : https://www.guru99.com/chrome-options-desiredcapabilities.html#:~:text=Initially%2C%20you%20need%20to%20set,From%20Selenium%203.8.
		
		System.setProperty("webdriver.chrome.driver","D:\\Recover\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);		
		driver.get("http://demo.guru99.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Page Title Chrome: " +title);
		driver.quit();
	}
}
