package dataprovider;

import org.testng.annotations.Test;

public class Group {
	@Test(groups="sanity")
	public void method1() {
		System.out.println("This is method1");
	}
	@Test(groups="performance")
	public void method2() {
		System.out.println("This is method2");
	}
	@Test(groups="smoke")
	public void method3() {
		System.out.println("This is method3");
	}
	@Test(groups="regression")
	public void method4() {
		System.out.println("This is method4");
	}

}
