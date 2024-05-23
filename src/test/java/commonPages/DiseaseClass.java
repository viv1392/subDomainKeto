package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilisClass;

public class DiseaseClass extends UtilisClass{
    WebDriver driver;
    public HowTallAreYou tall;
	public DiseaseClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Diabetes']")
	WebElement ele1;
	@FindBy(xpath="//span[text()='High blood pressure']")
	WebElement ele2;
	@FindBy(xpath="//span[text()='High cholesterol']")
	WebElement ele3;
	@FindBy(xpath="//span[text()='None of the above']")
	WebElement ele4;
	@FindBy(linkText="Continue")
	WebElement ele;

	public HowTallAreYou disease() {
		ele1.click();
		actionClass(driver,0,500);
		ele2.click();
		ele3.click();
		ele.click();
		tall=new HowTallAreYou(driver);
		return tall;
	}
	public HowTallAreYou noDisease() {
		actionClass(driver,0,1200);
		ele4.click();
		ele.click();
		tall=new HowTallAreYou(driver);
		return tall;
	}
}