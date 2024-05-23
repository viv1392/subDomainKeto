package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MealPreparationEachDay {
	WebDriver driver;
	public Meat meat;
	public MealPreparationEachDay(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Up to 1 hour")
	WebElement ele;
	public Meat mealPreparationEachDay () {
		ele.click();
		meat= new Meat(driver);
		return meat;
	}
}
