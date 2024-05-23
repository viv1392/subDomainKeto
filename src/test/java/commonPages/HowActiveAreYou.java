package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowActiveAreYou {
	WebDriver driver;
	public  HowYouSpendYourDay yourDay;
	public HowActiveAreYou(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//span[text()='Almost no physical activity']")
		WebElement ele1;
		@FindBy(xpath="//span[text()='I often go for a walk']")
		WebElement ele2;
		@FindBy(xpath="//span[text()='I exercise 3-5 times a week']")
		WebElement ele3;
	
	public HowYouSpendYourDay almostNoPhysicalActivity() {
		ele1.click();
		yourDay=new  HowYouSpendYourDay(driver);
		return yourDay;
  }
	public HowYouSpendYourDay iOftenGoForWalk() {
		ele2.click();
		yourDay=new  HowYouSpendYourDay(driver);
		return yourDay;
	}
	public HowYouSpendYourDay iExerciseTimesWeek(){
		ele3.click();
		yourDay=new  HowYouSpendYourDay(driver);
		return yourDay;
	}

}