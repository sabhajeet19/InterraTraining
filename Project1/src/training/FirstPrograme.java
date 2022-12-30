package training;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstPrograme {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "../Project1/chromedriver.exe");
	       //ChromeDriver driver = new ChromeDriver();
		
		  
		WebDriver driver = new ChromeDriver();
		String url = "https://the-internet.herokuapp.com/";
		driver.manage().window().maximize();
		driver.get(url);
		


	}

}
