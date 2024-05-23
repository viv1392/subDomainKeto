package commonPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilisClass;

public class YourKetoDietPlanIsReady extends UtilisClass {
	WebDriver driver;
	public BackToPlans backPlans;
	public YourKetoDietPlanIsReady(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='ok-tick']")
	List<WebElement> ele1;
	@FindBy(xpath="//div[text()='Buy Now →']")
	WebElement ele2;
	
	
	
	public BackToPlans oneMonthPlan() {
		actionClass(driver,0,600);
		ele1.get(0).click();
		backPlans=new BackToPlans(driver);
		return backPlans;
		
	}
	public BackToPlans sixMonthPlan() {
		actionClass(driver,0,600);
		ele2.click();
		backPlans=new BackToPlans(driver);
		return backPlans;
	}
	public BackToPlans threeMonthPlan() {
		actionClass(driver,0,600);
		ele1.get(2).click();
		backPlans=new BackToPlans(driver);
		return backPlans;
	}
	

}
