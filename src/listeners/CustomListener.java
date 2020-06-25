package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {
public void onStart(ITestContext arg)
{
	System.out.println("Start Test Execution"+arg.getName());
}
public void onFinish(ITestContext arg)
{
	System.out.println("Finish Test Execution"+arg.getName());
}
public void onTestStart(ITestResult arg1)
{
	System.out.println("Start Test "+arg1.getName());
}
public void onTestSkipped(ITestResult arg1)
{
	System.out.println("Skip Test "+arg1.getName());
}
public void onTestSuccess(ITestResult arg1)
{
	System.out.println("Passed Test "+arg1.getName());
}
public void onTestFailure(ITestResult arg1)
{
	System.out.println("Failed Test "+arg1.getName());
}
public void onTestFailedButWithinSuccessPercentage(ITestResult result)
{
	
}
}
