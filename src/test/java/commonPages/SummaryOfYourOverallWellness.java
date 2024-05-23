package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.UtilisClass;

public class SummaryOfYourOverallWellness extends UtilisClass {
	WebDriver driver;
	public SpecialOccasions occasions;
	public SummaryOfYourOverallWellness(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='18,200,000 + Users']")
	 WebElement ele1;
	@FindBy(linkText="Continue")
	WebElement ele;
	public SpecialOccasions overallWellness() {
		elementWait(driver,ele1);
		actionClass(driver,0,800);
		ele.click();
		occasions=new SpecialOccasions(driver); 
		return occasions;
	}
}
