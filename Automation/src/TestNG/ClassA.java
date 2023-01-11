package TestNG;

import org.testng.annotations.Test;

public class ClassA
{
	    
		
		@Test(priority = 1)
		public void login()
		{
		System.out.println("Login succesecfully");
		}

		@Test(dependsOnMethods = "login")
		public void search()
		{
		System.out.println("Product found");
		}
		
		@Test(dependsOnMethods = "search")
		public void select ()
		{
			System.out.println("product has been selelcted");
		}
		
		@Test(dependsOnMethods = "select")
		public void addToCard()
		{
		System.out.println("add succesecfully");
		}
		
		@Test(dependsOnMethods = "addToCard")
		public void payment()
		{
		System.out.println("add succesecfully");
		}
		
		@Test(dependsOnMethods = "payment")
		public void logout()
		{
		System.out.println("add succesecfully");
		}
		
		
	}

}
