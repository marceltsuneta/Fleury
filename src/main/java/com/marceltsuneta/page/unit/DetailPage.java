package com.marceltsuneta.page.unit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetailPage {

	private WebDriver driver;
	//Constructor
	   public DetailPage(WebDriver driver){
		   this.driver=driver;
		   //Initialise Elements
		   PageFactory.initElements(driver, this);
	   }
	
	   @FindBy(id = "button-scheduling-exam")
		private WebElement waitfortext;

		@FindBy(xpath = "//div[@id='gatsby-focus-wrapper']/div[8]/div[2]/div/h1")
		private WebElement unittest;
		
		@Test
		public void waitForText() {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(waitfortext));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-scheduling-exam")));
		}
		
		@Test
		public void testUnit (String arg[]) {
			UnitPage unit = new UnitPage(driver);
			String result = unittest.getText();
			System.out.println("Resultado da DatailPage:" + result);
			Assert.assertEquals("Vila Mariana", result);
			
			
	   }
}

