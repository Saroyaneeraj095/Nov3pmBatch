
//if you want to run same type of test case multiple time with multiple data.
 
package TestNG;

import org.testng.annotations.Test;

public class DataProvider 
{
	
	@Test(dataProvider = "data")
	public void test(String state,String capital)
	{
		System.out.println(state+" : "+capital);
	}
	
	@org.testng.annotations.DataProvider       //return 2 dimentional object
	public Object[][] data()
	{
		Object[][]ar = new Object[3][2];
		
		ar[0][0]="Delhi";
		ar[1][0]="UP";
		ar[2][0]="Karnataka";
		
		ar[0][1]="New Delhi";
		ar[1][1]="lucknow";
		ar[2][1]="bangluru";
		
		return ar;
		
	}
}





