package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilisClass;

public class ChoosePlan extends UtilisClass {
	WebDriver driver;
	public ChoosePlan(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Choose your plan ']")
     WebElement ele;
	
	public void choosePlan() throws InterruptedException {
		Thread.sleep(2000);
		actionClass(driver,0,1500);
		Thread.sleep(1000);
		ele.click();
		Thread.sleep(2000);
		}
}
