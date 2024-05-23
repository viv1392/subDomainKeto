package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilisClass;

public class PickYourDailyHabitsAndLifestylePreferences extends UtilisClass {
	WebDriver driver;
	public ShedSomeExtraWeight extraWeight;
	public PickYourDailyHabitsAndLifestylePreferences(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='I do not get quality sleep']")
	WebElement ele1;
	@FindBy(xpath="//span[text()='I eat late at night']")
	WebElement ele2;
	@FindBy(xpath="//span[text()='My salt intake is more']")
	WebElement ele3;
	@FindBy(xpath="//span[text()='I can not quit eating sweets']")
	WebElement ele4;
	@FindBy(xpath="//span[text()='I like soft drinks']")
	WebElement ele5;
	@FindBy(xpath="//span[text()='None of the above']")
	WebElement ele6;
	@FindBy(linkText="Continue")
	WebElement ele;
	
	public void qualitySleep() {
		ele1.click();
	}
	public void atNight() {
		ele2.click();
	}
	public void saltIntakeIsMore() {
		actionClass(driver,0,200);
		ele3.click();
	}
	public void quitEatingSweets() throws InterruptedException {
		Thread.sleep(1000);
		actionClass(driver,0,800);
		ele4.click();
	}
	public void softDrinks() throws InterruptedException {
		Thread.sleep(1000);
		actionClass(driver,0,800);
		ele5.click();
	}
	public ShedSomeExtraWeight continueButton() {
		ele.click();
		extraWeight =new ShedSomeExtraWeight(driver);
		return extraWeight;
	}
	public ShedSomeExtraWeight noneOfTheAbove() throws InterruptedException {
		Thread.sleep(1000);
		actionClass(driver,0,800);
		ele6.click();
		ele.click();
		extraWeight =new ShedSomeExtraWeight(driver);
		return extraWeight;
	}

}
