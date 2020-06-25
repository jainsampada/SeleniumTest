package TestNG;

import org.testng.annotations.Test;

public class MultiThread {
	@Test(threadPoolSize = 3, invocationCount = 6, timeOut = 1000)
	public void Tetscase1()
	{
		System.out.println("Test Case 1:Parallel class 1"+Thread.currentThread().getId());
		
	}
	
}
