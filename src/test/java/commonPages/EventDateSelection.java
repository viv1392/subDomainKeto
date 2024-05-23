package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventDateSelection {
	WebDriver driver;
	public OneAndOnlyPlan plan;
	public EventDateSelection(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='dd/mm/yyyy']")
	WebElement ele1;
	@FindBy(xpath="//a[text()='  Skip']")
	WebElement ele2;
	@FindBy(linkText="Continue")
	WebElement ele;
	
	public OneAndOnlyPlan dateSelection() throws InterruptedException {
		Thread.sleep(2000);
		ele1.sendKeys("15-04-2024");
		ele.click();
		plan=new OneAndOnlyPlan(driver);
		return plan;
	}
	public OneAndOnlyPlan skipThisQuestion() {
		ele2.click();
		plan=new OneAndOnlyPlan(driver);
		return plan;
	}
}
