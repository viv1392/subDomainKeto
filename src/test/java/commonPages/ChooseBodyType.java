package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseBodyType {
	WebDriver driver;
	public BodyTypeYouWant desiredbody;
	public ChooseBodyType(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Voluptuous']")
	WebElement ele1;
	@FindBy(xpath="//span[text()='Average']")
	WebElement ele2;
	@FindBy(xpath="//span[text()='Extra']")
	WebElement ele3;
	public BodyTypeYouWant choosebodyTypeVol() {
		ele1.click();
		desiredbody=new BodyTypeYouWant(driver);
		return desiredbody;
	}
	public BodyTypeYouWant choosebodyTypeAv() {
		ele2.click();
		desiredbody=new BodyTypeYouWant(driver);
		return desiredbody;
	}
	public BodyTypeYouWant choosebodyTypeEx() {
		ele3.click();
		desiredbody=new BodyTypeYouWant(driver);
		return desiredbody;
	}

}
