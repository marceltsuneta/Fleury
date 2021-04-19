package com.marceltsuneta;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BaseWeb {
	private WebDriver driver;
	
    public void testUntitledTestCase() {
    	
        WebDriverWait wait = new WebDriverWait(driver, 10);
             
        driver.get("https://www.fleury.com.br");
        
    }

    /*@Ignore
    @AfterMethod(alwaysRun = true)
    public void postCondition() { DriverManager.quit(); }*/
}
