package dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataSET {
	@DataProvider(name="DP")
	public Object [][]myDataProvider(Method m){
		Object [][] obj = null;
		if(m.getName().equalsIgnoreCase("register")) {
			obj = new Object[3][4];
			obj [0][0] = "Rahul";
			obj [0][1] = "Singh";
			obj [0][2] = "xyz@gmail.com";
			obj [0][3] = "111111";
			
			obj [1][0] = "Rahul1";
			obj [1][1] = "Singh1";
			obj [1][2] = "xyz1@gmail.com";
			obj [1][3] = "111112";
			
			obj [2][0] = "Rahul2";
			obj [2][1] = "Singh2";
			obj [2][2] = "xyz2@gmail.com";
			obj [2][3] = "1111113";
			
		}
		
		if(m.getName().equalsIgnoreCase("login")) {
			obj = new Object[3][2];
			
			obj [0][0] = "xyz@gmail.com";
			obj [0][1] = "111111";
			
			obj [1][0] = "xyz1@gmail.com";
			obj [1][1] = "111112";
			
			
			obj [2][0] = "xyz2@gmail.com";
			obj [2][1] = "1111113";
			
		}
		return obj;
	}

}
