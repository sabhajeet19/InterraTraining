package Project2.project2;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.auto.common.Visibility;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PageBrowse {
	
	//static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url ="https://www.amazon.in/";
		driver.get(url);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		System.out.println("Hi how are you");
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("Allen Solly");
		searchBar.sendKeys(Keys.ENTER);
		WebElement discount = driver.findElement(By.linkText("60% Off or more"));
		discount.click();
		Thread.sleep(5000);
		List<WebElement> ls = driver.findElements(By.xpath("//img[@class='s-image']"));
		System.out.println("Number of products that have more than 60% discount =  "+ls.size());
		
				

	}

}
