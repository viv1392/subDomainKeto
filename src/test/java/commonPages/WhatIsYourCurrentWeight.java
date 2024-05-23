package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.UtilisClass;

public class WhatIsYourCurrentWeight extends UtilisClass {
	WebDriver driver;
	public ConsiderYourPerfectWeight targetWeight;
	String msgScr="Please enter valid weight.";
	String msg="Please enter valid weight.";
	public WhatIsYourCurrentWeight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="weight_lb")
	WebElement ele1;
	@FindBy(xpath="//div[text()='kg']")
	WebElement ele2;
	@FindBy(id="weight_kg")
	WebElement ele3;
	@FindBy(id="height_inch_id")
	WebElement ele4;
	@FindBy(linkText="Continue")
	WebElement ele;
	
	public ConsiderYourPerfectWeight weightLbs() {
		String x=fkr.number().digits(2);
		int y=Integer.parseInt(x);
		int z=380-y;
		String k=Integer.toString(z);
		ele1.sendKeys(k);
		Assert.assertEquals(msgScr, msg);
		ele.click();
		targetWeight=new ConsiderYourPerfectWeight(driver);
		return targetWeight;
	}
	public ConsiderYourPerfectWeight weightKG() {
		ele2.click();
		String x=fkr.number().digits(1);
		int y=Integer.parseInt(x);
		int z=130-y;
		String k=Integer.toString(z);
		ele3.sendKeys(k);
		Assert.assertEquals(msgScr, msg);
		ele.click();
		targetWeight=new ConsiderYourPerfectWeight(driver);
		return targetWeight;
	}
	public ConsiderYourPerfectWeight withoutFakerweightLbs() {
		ele1.sendKeys("320");
		Assert.assertEquals(msgScr, msg);
		ele.click();
		targetWeight=new ConsiderYourPerfectWeight(driver);
		return targetWeight;
	}
	public ConsiderYourPerfectWeight withoutFakeeweightKG() {
		ele2.click();
		ele3.sendKeys("96");
		Assert.assertEquals(msgScr, msg);
		ele.click();
		targetWeight=new ConsiderYourPerfectWeight(driver);
		return targetWeight;
	}
	public ConsiderYourPerfectWeight NegativeTestweightLbs() {
		ele1.sendKeys("099");
		Assert.assertEquals(msgScr, msg);
		ele.click();
		targetWeight=new ConsiderYourPerfectWeight(driver);
		return targetWeight;
	}
	public ConsiderYourPerfectWeight negativeValueweightKG() {
		ele2.click();
		ele3.sendKeys("095");
		Assert.assertEquals(msgScr, msg);
		ele.click();
		targetWeight=new ConsiderYourPerfectWeight(driver);
		return targetWeight;
	}
	public ConsiderYourPerfectWeight invalidCurrrWeightKG() {
		ele2.click();
		ele3.sendKeys("030");
		Assert.assertEquals(msgScr, msg);
		ele.click();
		targetWeight=new ConsiderYourPerfectWeight(driver);
		return targetWeight;
	}
	public ConsiderYourPerfectWeight invalidCurrweightLbs() {
		ele1.sendKeys("080");
		Assert.assertEquals(msgScr, msg);
		ele.click();
		targetWeight=new ConsiderYourPerfectWeight(driver);
		return targetWeight;
	}
	

}
