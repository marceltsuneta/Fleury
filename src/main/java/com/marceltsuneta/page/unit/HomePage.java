package com.marceltsuneta.page.unit;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;
	private static String PAGE_URL="https://www.fleury.com.br";
	
	//Constructor
	   public HomePage(WebDriver driver){
	       this.driver=driver;
	       driver.get(PAGE_URL);
		    driver.manage().window().maximize();
	       //Initialise Elements
	       PageFactory.initElements(driver, this);
	   }
	
	@FindBy(partialLinkText = ("CONTINUAR"))
	private WebElement alert;
	
	@FindBy(xpath = "(//a[@id='button-title-desktop-header']/div)[4]")
    private WebElement unit;
	
    @Test
    public void clickAlert() {
    	//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(waitfortext));
		alert.click();
    }
	
    @Test
    public void clickUnit() {
    	unit.click();
    }
    
}
