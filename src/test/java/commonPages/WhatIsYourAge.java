package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.UtilisClass;

public class WhatIsYourAge extends UtilisClass {
	WebDriver driver;
	public SummaryOfYourOverallWellness wellness;
	String msgScr="Please enter valid age.";
	String msg="Please enter valid age.";
	public WhatIsYourAge(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='number']")
	WebElement ele1;
	@FindBy(linkText="Continue")
	WebElement ele;
	public SummaryOfYourOverallWellness yourAge() {
		String x=fkr.number().digits(2);
		int y=Integer.parseInt(x);
		int z1=60-y;
		String k1=Integer.toString(z1);
		ele1.sendKeys("42");
		Assert.assertEquals(msgScr, msg);
		ele.click();
		wellness=new SummaryOfYourOverallWellness(driver);
		return wellness;
	}
	public SummaryOfYourOverallWellness withoutFakeryourAge() {
		ele1.sendKeys("42");
		Assert.assertEquals(msgScr, msg);
		ele.click();
		wellness=new SummaryOfYourOverallWellness(driver);
		return wellness;
	}
}
