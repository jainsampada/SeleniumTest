package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.CustomListener.class)//make it comment if you are using testng.xml
public class ListenerDemo {
	@Test
void Test1()
{
	System.out.println("This is Test1");
	Assert.assertEquals("A", "A");
}
	@Test
	void Test2()
	{
		System.out.println("This is Test2");
		Assert.assertEquals("A", "B");
	}
	@Test
	void Test3()
	{
		System.out.println("This is Test3");
		throw new SkipException("This is skip Exception");
	}
}
