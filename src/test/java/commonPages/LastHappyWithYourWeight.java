package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LastHappyWithYourWeight {
	WebDriver driver;
	public  MealPreparationEachDay mealpreparation;
	public LastHappyWithYourWeight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Never']")
	WebElement ele;
	public MealPreparationEachDay  lastHappyWithYourWeight() {
		ele.click();
		mealpreparation=new MealPreparationEachDay(driver);
		return mealpreparation;
	}
}
