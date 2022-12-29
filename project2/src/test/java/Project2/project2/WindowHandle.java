package Project2.project2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "https://the-internet.herokuapp.com/";
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		for(String handle1:handles) {
			driver.switchTo().window(handle1);
			if(handle1.equalsIgnoreCase(handle)) {
				continue;
			}
			else {
				Thread.sleep(5000);
				driver.close();
			}
		}
		

	}

}
