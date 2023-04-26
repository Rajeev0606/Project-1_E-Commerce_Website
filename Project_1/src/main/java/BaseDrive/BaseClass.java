package BaseDrive;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass extends UtilityClass {
	@BeforeMethod
	public void Startup() throws Exception {
		
	driver = initializeDriver();
	driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void Closeup() throws Exception {
		Thread.sleep(8000);
			driver.quit();
		}
	
	public void onTestStart(ITestResult result) {
	}

	public void onTestSuccess(ITestResult result) {
	}

	public void onTestFailure(ITestResult result) {
	}

	public void onFinish(ITestContext context) {
	}
	
	public String takeScreenshot(String testName, WebDriver driver) throws IOException {

		File srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotFilePath = System.getProperty("user.dir") + "\\Screenshots\\" + testName + ".png";
		FileUtils.copyFile(srcScreenshot, new File(screenshotFilePath));
		return screenshotFilePath;
	}

}
