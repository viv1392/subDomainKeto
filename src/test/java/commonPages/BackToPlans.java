package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackToPlans {
	WebDriver driver;
	public GotIt gotit;

	public BackToPlans(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()=' Back to Plans']")
	WebElement ele1;
	
	public GotIt backToPlan() {
		ele1.click();
		gotit=new GotIt(driver);
		return gotit;
	}
}
