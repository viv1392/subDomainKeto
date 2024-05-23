package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinuePage {
	WebDriver driver;
	public ChooseYourTargetZones zone;
	public ContinuePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Continue")
	WebElement ele;
	public ChooseYourTargetZones continuePage() {
		ele.click();
		zone=new ChooseYourTargetZones(driver);
		return zone;
	}

}
