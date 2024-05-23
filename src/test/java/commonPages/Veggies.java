package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilisClass;

public class Veggies extends UtilisClass{
	WebDriver driver;
	public OtherFoodItems foodItems;
	public Veggies(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Broccoli']")
	WebElement ele1;
	@FindBy(xpath="//span[text()='Zucchini']")
	WebElement ele2;
	@FindBy(xpath="//span[text()='Avocado']")
	WebElement ele3;
	@FindBy(xpath="//span[text()='Spinach']")
	WebElement ele4;
	@FindBy(xpath="//span[text()='I eat all']")
	WebElement ele5;
	@FindBy(linkText="Continue")
	WebElement ele;
	public OtherFoodItems veggies() {
		scriptExecutor(ele1,driver);
		//ele1.click();
		//actionClass(driver,0,1000);
		scriptExecutor(ele2,driver);
		//ele2.click();
		scriptExecutor(ele3,driver);
		//ele3.click();
		scriptExecutor(ele,driver);
		//ele.click();
		foodItems=new OtherFoodItems(driver);
		return foodItems;
		
	}
	public OtherFoodItems eatAllVeggies() {
		scriptExecutor(ele5,driver);
		//ele5.click();
		scriptExecutor(ele,driver);
		//ele.click();
		foodItems=new OtherFoodItems(driver);
		return foodItems;
	}


}
