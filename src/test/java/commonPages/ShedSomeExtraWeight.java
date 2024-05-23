package commonPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShedSomeExtraWeight {
	WebDriver driver;
	public  DiseaseClass disease;
	public ShedSomeExtraWeight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Just Want to See how Keto Diet helps in weight loss']")
	WebElement ele1;
	@FindBy(xpath="//span[text()='I want to try and lose some weight']")
	WebElement ele2;
	@FindBy(xpath="//div[@class='box']")
	List<WebElement> ele3;
	
	public DiseaseClass justWant() {
		ele1.click();
		disease=new DiseaseClass(driver);
		return disease;
	}
	public DiseaseClass iWant() {
		ele2.click();
		disease=new DiseaseClass(driver);
		return disease;
	}
	public DiseaseClass  asPossible() {
		ele3.get(2).click();
		disease=new DiseaseClass(driver);
		return disease;
	}

}
