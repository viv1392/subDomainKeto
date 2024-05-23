package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilisClass;

public class OtherFoodItems extends UtilisClass {
	WebDriver driver;
	public  HowActiveAreYou activeAre;
	public OtherFoodItems(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Egg']")
	WebElement ele1;
	@FindBy(xpath="//span[text()='Nuts']")
	WebElement ele2;
	@FindBy(xpath="//span[text()='Chesse']")
	WebElement ele3;
	@FindBy(xpath="//span[text()='Coconut']")
	WebElement ele4;
	@FindBy(xpath="//span[text()='Olives']")
	WebElement ele5;
	@FindBy(xpath="//span[text()='Strawberry']")
	WebElement ele6;
	@FindBy(xpath="//span[text()='I eat all']")
	WebElement ele7;
	@FindBy(linkText="Continue")
	WebElement ele;
	public HowActiveAreYou non_veg() {
		scriptExecutor(ele1,driver);
		//ele1.click();
		//actionClass(driver,0,800);
		scriptExecutor(ele2,driver);
		//ele2.click();
		scriptExecutor(ele5,driver);
		//ele5.click();
		scriptExecutor(ele,driver);
		//ele.click();
		activeAre=new  HowActiveAreYou(driver);
		return activeAre;
	}
	public HowActiveAreYou veget() throws InterruptedException {
		scriptExecutor(ele2,driver);
		//ele2.click();
		Thread.sleep(2000);
		//actionClass(driver,0,1000);
		scriptExecutor(ele4,driver);
		//ele4.click();
		scriptExecutor(ele5,driver);
		//ele5.click();
		scriptExecutor(ele,driver);
		//ele.click();
		activeAre=new  HowActiveAreYou(driver);
		return activeAre;
	}
	public HowActiveAreYou vega() throws InterruptedException {
		Thread.sleep(2000);
		//actionClass(driver,0,800);
		scriptExecutor(ele4,driver);
		//ele4.click();
		scriptExecutor(ele5,driver);
		//ele5.click();
		scriptExecutor(ele6,driver);
		//ele6.click();
		scriptExecutor(ele,driver);
		//ele.click();
		activeAre=new  HowActiveAreYou(driver);
		return activeAre;
	}
	public HowActiveAreYou eatAll() {
		scriptExecutor(ele7,driver);
		//ele7.click();
		scriptExecutor(ele,driver);
		//ele.click();
		activeAre=new  HowActiveAreYou(driver);
		return activeAre;
	}

}
