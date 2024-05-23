package commonPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilisClass;

public class ChooseYourTargetZones extends UtilisClass {
	WebDriver driver;
	public  LastHappyWithYourWeight happy;
	public ChooseYourTargetZones(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='box1']")
	List<WebElement>ele;
	@FindBy(xpath="//div[text()='Continue']")
	WebElement ele1;
	public LastHappyWithYourWeight yourTargetZone() {
		for(WebElement eles :ele) {
			eles.click();
		}
		actionClass(driver,0,600);
		ele1.click();
		happy=new LastHappyWithYourWeight(driver);
		return happy;
		
	}

}
