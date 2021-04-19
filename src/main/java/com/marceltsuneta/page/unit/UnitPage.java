package com.marceltsuneta.page.unit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnitPage {

	private WebDriver driver;
	//Constructor
	   public UnitPage(WebDriver driver){
	       this.driver=driver;
	       //Initialise Elements
	       PageFactory.initElements(driver, this);
	   }
	
	@FindBy(xpath = "//div[@id='checkoox-select-facilities']/div")
    private WebElement unit;
	
	@FindBy(tagName = "body")
	private WebElement unidades;
		
	@FindBy(css = "div.boxcomponentstyle__Item-sc-43ermp-1.kVNSgu > label.typographycomponentstyle__BodySecondary-sc-1oox73n-6.hwutpP")
	private WebElement facility;
	
	@FindBy(css = "h3.typographycomponentstyle__H3-sc-1oox73n-3.caOpMn")
	private WebElement copyunit;
	
	@FindBy(css = "div.sc-htpNat.gridcomponent__ColStyled-sc-8zg10d-2.hezrQv > p.typographycomponentstyle__Body-sc-1oox73n-5.hWDpiu")
	private WebElement gotounit;
	
	@Test
    public void clickUnit() {
    	unit.click();
    }
	
	@Test
	public void checkUnidade() {
		//Assert.assertTrue(unidades).getText().contains("UNIDADES PRÓXIMAS");
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("UNIDADES PRÓXIMAS"));
	}
	
	@Test
	public void clickFacility() {
    	facility.click();
    }
	
	
	@Test
	public void copyUnit() {
		String unitchosen = copyunit.getText();
		System.out.println("Restuldado da UnitPage:" + unitchosen);
		//String unidade = driver.findElement(By.cssSelector("h3.typographycomponentstyle__H3-sc-1oox73n-3.caOpMn")).getText();
    }
	
	
	@Test
	public void clickChosenUnit() {
		gotounit.click();
	}

}
