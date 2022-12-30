package Project2.project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url = "https://the-internet.herokuapp.com/";
		driver.get(url);
		WebElement hover = driver.findElement(By.xpath("//a[text()='Hovers']"));
		hover.click();
		WebElement image = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(image).build().perform();
		
		

	}

}
