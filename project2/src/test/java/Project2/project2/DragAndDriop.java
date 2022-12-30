package Project2.project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDriop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver(); 
         WebDriver driver= new FirefoxDriver();  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url = "https://the-internet.herokuapp.com/";
		driver.get(url);
		WebElement DragAndDrop = driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
		DragAndDrop.click();
		WebElement A = driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement B = driver.findElement(By.xpath("//div[@id='column-b']"));
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.dragAndDrop(A, B).build().perform();
		System.out.println("Drag and Drop Completed");

	}

}
