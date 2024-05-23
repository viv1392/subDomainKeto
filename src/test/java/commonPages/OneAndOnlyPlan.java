package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OneAndOnlyPlan {
	WebDriver driver;
	public Your4WeekKetoDietingPlan week;
	public OneAndOnlyPlan(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Continue")
	WebElement ele;
	public Your4WeekKetoDietingPlan oneAndOnlyPlan(){
		ele.click();
		week=new Your4WeekKetoDietingPlan(driver);
		return week;
		
	}

}
