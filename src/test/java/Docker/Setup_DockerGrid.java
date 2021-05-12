package Docker;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class Setup_DockerGrid {
	@BeforeTest
	void startdocker() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start Start_dockerGrid.bat");  // starts the cmd and run the .bat file
		Thread.sleep(15000);
	}
	@AfterTest
	void stopdocker() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start stop_dockerGrid.bat"); // starts the cmd and run the .bat file
		Thread.sleep(15000);
//		Runtime.getRuntime().exec("taskkill /f /im cmd.exe"); // closes the terminal
	}

}
