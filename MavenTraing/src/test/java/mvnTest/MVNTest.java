package mvnTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MVNTest {
	@Test
	
	public void firstTestCase() {
	//	public static void main(String[] args) {
			
		
		System.out.println("This is maven ");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		String url = "https://the-internet.herokuapp.com/";
		driver.get(url);
		System.out.println("Title of the page is: "+driver.getTitle());
		
		
		
	}

}
