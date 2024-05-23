package utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

public class UtilisClass {
	public WebDriver driver;
	public Faker fkr =new Faker();
	public void actionClass(WebDriver driver,int x,int y) {
		Actions action = new Actions(driver);
		action.scrollByAmount(x, y).build().perform();
	}
	
	public void elementWait(WebDriver driver,WebElement ele) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30)); 
		wait.until(ExpectedConditions.invisibilityOf(ele));	
	}
	
	public static String screenShot(WebDriver driver, String testName) throws IOException {
		File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationScreenshotPath = System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png";
		try {
			FileHandler.copy(srcScreenshot,new File(destinationScreenshotPath));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return destinationScreenshotPath;
	}
	public void scriptExecutor(WebElement ele ,WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
	}
}
