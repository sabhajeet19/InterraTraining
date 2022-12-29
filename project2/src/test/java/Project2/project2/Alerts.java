package Project2.project2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "https://the-internet.herokuapp.com/";
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().dismiss();
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		WebElement JsPrompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		System.out.println(JsPrompt.getText());
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", JsPrompt);
		//driver.switchTo().alert().dismiss();
		org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
		String alertmessage = alert3.getText();
		System.out.println("This is alert text :  "+ alertmessage);
		Thread.sleep(3000);
		alert3.sendKeys("JS Prompt");
		Thread.sleep(3000);
		//alert3.dismiss();
		alert3.accept();





	}

}
