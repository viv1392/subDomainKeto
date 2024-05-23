package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilisClass;

public class SpecialOccasions extends UtilisClass {
	WebDriver driver;
	public EventDateSelection date;
	public OneAndOnlyPlan plan;
	
	public SpecialOccasions(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Vacation']")
	WebElement ele1;
	@FindBy(xpath="//span[text()='Wedding']")
	WebElement ele2;
	@FindBy(xpath="//span[text()='Sporting event']")
	WebElement ele3;
	@FindBy(xpath="//span[text()='Family occasion']")
	WebElement ele4;
	@FindBy(xpath="//span[text()='Other']")
	WebElement ele5;
	@FindBy(xpath="//span[text()='No']")
	WebElement ele6;

	
	public EventDateSelection vacation() {
		ele1.click();
		date=new EventDateSelection(driver);
		return date;
		
	}
	public EventDateSelection wedding() {
		ele2.click();
		date=new EventDateSelection(driver);
		return date;
	}
	public EventDateSelection sportingEvent() {
		ele3.click();
		date=new EventDateSelection(driver);
		return date;
	}
	public EventDateSelection familyOccasion() {
		actionClass(driver,0,800);
		ele4.click();
		date=new EventDateSelection(driver);
		return date;
	}
	public EventDateSelection Other() {
		actionClass(driver,0,800);
		ele5.click();
		date=new EventDateSelection(driver);
		return date;
	}
	public OneAndOnlyPlan No() {
		actionClass(driver,0,800);
		ele6.click();
		plan=new OneAndOnlyPlan(driver);
		return plan;
	}

}
