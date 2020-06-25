package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	@Parameters({ "browser" })
	@Test
	public void testCaseOne(String browser) {
		System.out.println("browser passed as :- " + browser);
	}
}
