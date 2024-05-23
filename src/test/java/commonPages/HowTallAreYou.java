package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.UtilisClass;

public class HowTallAreYou extends UtilisClass {
	   WebDriver driver;
	   public  WhatIsYourCurrentWeight currentWt;
	   
	   String popUpAtScr="Please enter valid height.";
	   String msg="Please enter valid height.";
	   int z;
	public HowTallAreYou(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(id="height_cm_id")
		WebElement ele1;
		@FindBy(xpath="//div[text()='ft']")
		WebElement ele2;
		@FindBy(id="height_feet_id")
		WebElement ele3;
		@FindBy(id="height_inch_id")
		WebElement ele4;
		@FindBy(linkText="Continue")
		WebElement ele;
		public WhatIsYourCurrentWeight heightCm() {
			String x=fkr.number().digits(1);
			 int z=Integer.parseInt(x);
			 int k=190-z;
			 String ht=Integer.toString(k);
			 if(k>135 && k<200) {
				 ele1.sendKeys(ht); 
			 }
			 else {
				 ele1.sendKeys("182");
			 }
			
			Assert.assertEquals(popUpAtScr, msg);
			ele.click();
			currentWt=new WhatIsYourCurrentWeight(driver);
			return currentWt;
		}
		public WhatIsYourCurrentWeight heightFeet() {
			ele2.click();
			String x=fkr.number().digits(1);
			int z=Integer.parseInt(x);
			if(z>=3 && z<=6) {
			ele3.sendKeys(x);
			}
			else {
				ele3.sendKeys("5");
			}
			Assert.assertEquals(popUpAtScr, msg);
			String y=fkr.number().digits(1);
			ele4.sendKeys(y);
			Assert.assertEquals(popUpAtScr, msg);
			ele.click();
			currentWt=new WhatIsYourCurrentWeight(driver);
			return currentWt;
		}
		public WhatIsYourCurrentWeight withoutFakerheightCm() {
			ele1.sendKeys("179");
			Assert.assertEquals(popUpAtScr, msg);
			ele.click();
			currentWt=new WhatIsYourCurrentWeight(driver);
			return currentWt;
		}
		public WhatIsYourCurrentWeight withoutFakerheightFeet() {
			ele2.click();
			ele3.sendKeys("5");
			Assert.assertEquals(popUpAtScr, msg);
			ele4.sendKeys("11");
			Assert.assertEquals(popUpAtScr, msg);
			ele.click();
			currentWt=new WhatIsYourCurrentWeight(driver);
			return currentWt;
		}
		public WhatIsYourCurrentWeight heightCmPreDef() {
			 ele1.sendKeys("0180");
			 ele.click();
			 currentWt=new WhatIsYourCurrentWeight(driver);
				return currentWt;
			
		}
		public WhatIsYourCurrentWeight negheightCmPreDef() {
			 ele1.sendKeys("120");
			 ele.click();
			 currentWt=new WhatIsYourCurrentWeight(driver);
				return currentWt;
		
		} 
		public WhatIsYourCurrentWeight negativeHeightTesFt() {
			ele2.click();
			ele3.sendKeys("05");
			ele4.sendKeys("20");
			currentWt=new WhatIsYourCurrentWeight(driver);
			return currentWt;
		}
	

}
