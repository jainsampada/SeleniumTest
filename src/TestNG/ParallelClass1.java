package TestNG;

import org.testng.annotations.Test;

public class ParallelClass1 {
	@Test
	public void Tetscase1()
	{
		System.out.println("Test Case 1:Parallel class 1"+Thread.currentThread().getId());
		
	}
	
	@Test
	public void Tetscase2()
	{
		System.out.println("Test Case 2:Parallel class 1"+Thread.currentThread().getId());
		
	}


}
