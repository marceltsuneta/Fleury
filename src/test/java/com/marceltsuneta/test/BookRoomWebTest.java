package com.marceltsuneta.test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.marceltsuneta.BaseWeb;
import com.marceltsuneta.page.unit.DetailPage;
import com.marceltsuneta.page.unit.HomePage;
import com.marceltsuneta.page.unit.UnitPage;

public class BookRoomWebTest{
	WebDriver driver;
	  
	  @Before
	  public void setup() {
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	   }
	
	
	@Test
    public void openTheUnit() {
			
		HomePage home = new HomePage(driver);
		home.clickAlert();
		home.clickUnit();
		
		UnitPage unit = new UnitPage(driver);
		unit.clickUnit();
		unit.clickFacility();
		unit.copyUnit();
		unit.clickChosenUnit();
		
		DetailPage detail = new DetailPage(driver);
		detail.waitForText();
		detail.testUnit(null);
		
		
	}

}
