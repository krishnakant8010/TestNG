package besic_learing_testgn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
	//parameterization = test case (username + password ) [u1/p1, u2/p2 ,u3/p3.....Nn/Pn]
	
	@Test(dataProvider="getData") //3rd step:- data provider has to be mentions with the name of the methods inside the dataProvider
	
	//4th Step:-no of input parameters inside the methods =number of columns in the dataPrvider Object Arrays  
	public void DataMatrix(String Userneme, String Password, int Mobile , String Browser) {
	
	}
	@DataProvider 
	
	// 1st Step:- Returns a 2 dimensional Object Array 
	//2nd  step :- Rows and columns - your have to specify
	public Object [][] getData(){
		Object[][] data = new Object[3][4];//R[rows][columns]
		
		data[0][0] = "Username";
		data[0][1] = "Password";
		data[0][2] = 98765;
		data[0][3] = "Chrome";
			
		data[1][0] = "Username1";
		data[1][1] = "Password1";
		data[1][2] = 90102;
		data[1][3] = "Mozilla";
				
		data[2][0] = "Username2";
		data[2][1] = "Password2";
		data[2][2] = 88778;
		data[2][3] = "Safari";
		
		return data;
		
		
	}
}
