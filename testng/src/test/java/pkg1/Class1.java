package pkg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("This is befor method");
	}
	@Test
	public void test1() {
	System.out.println("This is test1");
	}
	@Test
	public void test2() {
	System.out.println("This is test2");
	}
	@Test
	public void test3() {
	System.out.println("This is test3");
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
