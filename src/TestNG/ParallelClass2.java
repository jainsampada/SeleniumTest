package TestNG;

import org.testng.annotations.Test;

public class ParallelClass2 {
	@Test
	public void Tetscase1()
	{
		System.out.println("Test Case 1:"+Thread.currentThread().getId());
		
	}
	
	@Test
	public void Tetscase2()
	{
		System.out.println("Test Case 2:"+Thread.currentThread().getId());
		
	}
}
