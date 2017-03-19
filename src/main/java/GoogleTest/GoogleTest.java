package GoogleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@Test
	public void googleTest() throws IOException
	{
	WebDriver wd = new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("https://www.google.co.in/");
	
	File f =  ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\Selenium_Homework\\GitHubTest\\src\\Output111\\screenshot1.jpg"));
	}

}
