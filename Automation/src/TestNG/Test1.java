package TestNG;

import org.testng.annotations.Test;
//@Test annotated class
public class Test1 {
	
	@Test      // act as a main method
	public void bdemo1( ) 
	//@Test annotated method
	{
		System.out.println("Demo Test 1");
	}
    @Test
	public void ademo2( ) 
	//@Test annotated method
	{
		System.out.println("Demo Test 2");
	}
	@Test
	public void cdemo3( ) 
	//@Test annotated method
	{
		System.out.println("Demo Test 3");
	}
}

