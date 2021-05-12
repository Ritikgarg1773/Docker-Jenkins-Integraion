package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerMainMethod {
	public static void main(String[] args) throws MalformedURLException {
//		DesiredCapabilities dc = DesiredCapabilities.chrome();
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("WebPage Title: "+driver.getTitle());
		driver.close();
	}
}
