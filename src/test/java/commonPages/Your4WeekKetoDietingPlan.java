package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.UtilisClass;

public class Your4WeekKetoDietingPlan extends UtilisClass  {
	WebDriver driver;
	public YourKetoDietPlanIsReady planReady;
	String scrMsg="Please enter valid email id";
	public Your4WeekKetoDietingPlan(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Please enter valid email id")
	WebElement ele1;
	@FindBy(id="mail-value")
	WebElement ele2;
	@FindBy(linkText="Continue")
	WebElement ele;
	public YourKetoDietPlanIsReady blankEmail() {
		actionClass( driver,0,1000);
		ele.click();
		String msg=ele1.getText();
		Assert.assertEquals(scrMsg, msg);
		planReady=new  YourKetoDietPlanIsReady(driver);
		return planReady;
	}
	public YourKetoDietPlanIsReady validEmail() {
		actionClass( driver,0,1000);
		String mail=fkr.internet().emailAddress();
		ele2.sendKeys(mail);
		ele.click();
		planReady=new  YourKetoDietPlanIsReady(driver);
		return planReady;
	}
}
