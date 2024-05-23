package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GotIt {
	WebDriver driver;
	public ChoosePlan chooseplan;
	 
	public GotIt(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='Got It!']")
	WebElement ele;
	
	public ChoosePlan goIt() {
		ele.click();
		chooseplan=new ChoosePlan(driver);
		return chooseplan;
	}

}
