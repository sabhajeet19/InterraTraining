package Project2.project2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://the-internet.herokuapp.com/";
		driver.get(url);
		System.out.println("Title of the page:  "+driver.getTitle());
		WebElement dropdown = driver.findElement(By.xpath("//a[text()='Dropdown']"));
		dropdown.click();
		WebElement dropdownList = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select oneSelect = new Select(dropdownList);
		//oneSelect.selectByVisibleText("Option 1");
		//oneSelect.selectByIndex(2);
		oneSelect.selectByValue("2");
		List<WebElement> options = oneSelect.getOptions();
		System.out.println("numbre of values in the dropdown: "+options.size());
		int i;
		for(i=0; i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		Thread.sleep(3000);
		

	}

}
