import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fleury {
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new ChromeDriver();
	    baseUrl = "https://www.google.com/";
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	  }

	  @Test
	  public void testUntitledTestCase() throws Exception {
	    driver.get("https://www.fleury.com.br");
	    driver.findElement(By.partialLinkText("CONTINUAR")).click();
	    driver.findElement(By.xpath("(//a[@id='button-title-desktop-header']/div)[4]")).click();
	    //driver.findElement(By.partialLinkText("CONTINUAR")).click();
	    driver.findElement(By.xpath("//div[@id='checkoox-select-facilities']/div")).click();
	    Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("UNIDADES PRÓXIMAS"));
	    //driver.findElement(By.cssSelector(".checkbox-fieldcomponentstyle__CheckboxFieldStyled-sc-1mdajsk-0:nth-child(3) > .fa-check-square > path")).click();
	    driver.findElement(By.cssSelector("div.boxcomponentstyle__Item-sc-43ermp-1.kVNSgu > label.typographycomponentstyle__BodySecondary-sc-1oox73n-6.hwutpP")).click();
	    //System.out.println(driver.findElement(By.cssSelector(".sc-bdVaJa > .eYPaKj:nth-child(2)")).getText()); //vai imprimir todo o texto
	    
	    String unidade = driver.findElement(By.cssSelector("h3.typographycomponentstyle__H3-sc-1oox73n-3.caOpMn")).getText();
	    System.out.println("acessibilidade" + unidade);
	    
	    driver.findElement(By.cssSelector("div.sc-htpNat.gridcomponent__ColStyled-sc-8zg10d-2.hezrQv > p.typographycomponentstyle__Body-sc-1oox73n-5.hWDpiu")).click();
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-scheduling-exam")));
	    
	    String resultado = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div[8]/div[2]/div/h1")).getText();
	    System.out.println("unidade" + resultado);
	    
	    Assert.assertEquals(unidade, resultado);
	    
	    
	    
	    /*try {
	        
	      } catch (Error e) {
	        verificationErrors.append(e.toString());
	      }*/
	    
	    
	    
	    
	    
	    
	  }

	  /*
	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }*/
}
