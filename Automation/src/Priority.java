import org.testng.annotations.Test;

public class Priority {
	
	
	@Test(priority = 2)      // act as a main method
	public void Ademo1( ) 
	//@Test annotated method
	{
		System.out.println("Demo Test 2");
	}
    @Test(priority = 3)
	public void ademo2( ) 
	//@Test annotated method
	{
		System.out.println("Demo Test 3");
	}
	@Test(priority = 1)
	public void Bdemo3( ) 
	//@Test annotated method
	{
		System.out.println("Demo Test 4");
	}
	
	@Test (priority = 4)     // act as a main method
	public void cdemo1( ) 
	//@Test annotated method
	{
		System.out.println("Demo Test 1");
	}

}
