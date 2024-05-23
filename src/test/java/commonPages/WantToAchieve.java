package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.UtilisClass;


public class WantToAchieve extends UtilisClass{
	WebDriver driver;
	ContinuePage conti;
	public WantToAchieve(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Lose weight']")
	 WebElement ele1;
	@FindBy(xpath="//span[text()='Boost brain power']")
	 WebElement ele2;
	@FindBy(xpath="//span[text()='Sleep better']")
	 WebElement ele3;
	@FindBy(xpath="//span[text()='Reduce the risk of cancer']")
	 WebElement ele4;
	@FindBy(linkText="Yes, I Got it")
	 WebElement ele5;
	public ContinuePage wantToAchieve() {
		ele1.click();
		actionClass(driver,0,200);
		ele2.click();
		actionClass(driver,201,800);
		ele3.click();
		ele4.click();
		ele5.click();
		conti=new ContinuePage(driver);
		return conti;
			
		
	}
	


}
