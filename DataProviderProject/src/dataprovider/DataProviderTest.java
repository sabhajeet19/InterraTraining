package dataprovider;

import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProviderClass=DataSET.class, dataProvider="DP")
	public void login(String email, String password) {
		System.out.println(email+" "+password);
	}
	@Test(dataProviderClass=DataSET.class, dataProvider="DP")
	public void register(String firstName, String surName, String email, String password ) {
	System.out.println(firstName+" "+surName+" "+password);	
	}

}
