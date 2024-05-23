package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilisClass;

public class GenderSel extends UtilisClass {
	WebDriver driver;
	public ChooseBodyType bodyType;
	public GenderSel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Man']")
	WebElement men;
	@FindBy(xpath="//p[text()='Woman']")
	WebElement women;
	public ChooseBodyType genderMen() {
		//scriptExecutor(men,driver);
		men.click();
	    bodyType=new ChooseBodyType(driver);
	    return bodyType;
	}
	public ChooseBodyType genderWomen() {
		//scriptExecutor(women,driver);
		women.click();
		 bodyType=new ChooseBodyType(driver);
		    return bodyType;
		
	}
}
