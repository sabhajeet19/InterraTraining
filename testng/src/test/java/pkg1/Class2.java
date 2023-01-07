package pkg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2 {
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("This is befor method");
	}
	@Test(priority=-3)
	public void test1() {
	System.out.println("This is test1");
	}
	@Parameters("url")
	@Test(priority=2)
	public void test2(String url) {
	System.out.println("This is test2");
	System.out.println("This is url: "+url);
	}
	@Test(priority=1)
	public void test3() {
	System.out.println("This is test3");
	}
	@Test(dependsOnMethods="test3")
	public void test4() {
		System.out.println("This is test4");
		}
	@AfterMethod
	public void afterMethod() {
	System.out.println("This is afterMethod");
	}
	@BeforeSuite
	public void beforeSuit() {
	System.out.println("This is beforSuit");
	}
	@AfterSuite
	public void AfterSuit() {
	System.out.println("This is afterSuit");
	}
	@BeforeClass
	public void beforeClass() {
	System.out.println("This is beforClass");
	}
	@AfterClass
	public void afterClass() {
	System.out.println("This is afterClass");
	}
	@BeforeTest
	public void beforeTest() {
	System.out.println("This is beforTest");
	}
	@AfterTest
	public void afterTest() {
	System.out.println("This is afterTest");
	}
	
}
