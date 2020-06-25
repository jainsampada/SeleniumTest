package TestNGPart2;

import org.testng.annotations.Test;

public class MultiThreadDemo {
@Test(threadPoolSize = 8,invocationCount = 6,timeOut=1000)
public void TestCase1()
{
	System.out.println("Test Case 1"+Thread.currentThread().getId());
}
}
