package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BodyTypeYouWant {
	WebDriver driver;
	public WantToAchieve achieve;
	public BodyTypeYouWant(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Bulk']")
	WebElement ele1;
	@FindBy(xpath="//span[text()='Cut']")
	WebElement ele2;
	@FindBy(xpath="//span[text()='Fit']")
	WebElement ele3;
	public WantToAchieve bodytypeYouWantBulk() {
		ele1.click();
		achieve=new WantToAchieve(driver);
		return achieve;
		
	}
	public WantToAchieve bodytypeYouWantCut() {
		ele2.click();
		achieve=new WantToAchieve(driver);
		return achieve;
		
	}
	public WantToAchieve bodytypeYouWantFit() {
		ele3.click();
		achieve=new WantToAchieve(driver);
		return achieve;
		
	}

}
