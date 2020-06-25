package TestNGPart2;

import org.testng.annotations.Test;

public class ParallelMethods {
	@Test
public void TestCase1()
{
		//Firefox Launch
	System.out.println("Test case1"+Thread.currentThread().getId());
}
	@Test
	public void TestCase2()
	{
		//Chrome Launch
		System.out.println("TestCase 2"+Thread.currentThread().getId());
	}
}


