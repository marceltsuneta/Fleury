package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.marceltsuneta.page.unit.DetailPage;
import com.marceltsuneta.page.unit.HomePage;
import com.marceltsuneta.page.unit.UnitPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Given("^user is already on page$")
	public void given() {
		driver = new ChromeDriver();
		baseUrl = "https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.fleury.com.br");
		driver.findElement(By.partialLinkText("CONTINUAR")).click();
	}

	@When("^user click on Unidade$")
	public void when() {
		driver.findElement(By.xpath("(//a[@id='button-title-desktop-header']/div)[4]")).click();
	}

	@And("^user choose the facility$")
	public void user_choose_the_facility() {
		driver.findElement(By.xpath("//div[@id='checkoox-select-facilities']/div")).click();
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("UNIDADES PRÓXIMAS"));
		driver.findElement(By.cssSelector(
				"div.boxcomponentstyle__Item-sc-43ermp-1.kVNSgu > label.typographycomponentstyle__BodySecondary-sc-1oox73n-6.hwutpP"))
				.click();
	}

	@And("^user selects an unit$")
	public void user_selects_an_unit() {
		String unidade = driver.findElement(By.cssSelector("h3.typographycomponentstyle__H3-sc-1oox73n-3.caOpMn"))
				.getText();
		driver.findElement(By.cssSelector(
				"div.sc-htpNat.gridcomponent__ColStyled-sc-8zg10d-2.hezrQv > p.typographycomponentstyle__Body-sc-1oox73n-5.hWDpiu"))
				.click();
	}

	@Then("^the unit name is the same selected$")
	public void unit_same_selected() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-scheduling-exam")));
		String resultado = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div[8]/div[2]/div/h1"))
				.getText();
		System.out.println("unidade" + resultado);
		Assert.assertEquals("Vila Mariana", resultado);
	}

}
