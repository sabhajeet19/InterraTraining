package Project2.project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebOperation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "https://the-internet.herokuapp.com/";
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		WebElement middleFrame = driver.findElement(By.xpath("//div[@id='content']"));
		System.out.println(middleFrame.getText());
		//driver.get(url);
		//driver.navigate().refresh();
		//driver.navigate().back();
		//Thread.sleep(5000);
		//driver.switchTo().frame("frame-middle");
		//driver.switchTo().frame("frame-top");
		//driver.navigate().back();
		
		
		

	}

}
