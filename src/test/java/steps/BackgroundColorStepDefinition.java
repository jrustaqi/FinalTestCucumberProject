package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BackgroundColorChangePage;
import pages.TestBase;

public class BackgroundColorStepDefinition extends TestBase {

	BackgroundColorChangePage backgroundColorChangePage;

	@Before
	public void init() {
		initDriver();
		backgroundColorChangePage = PageFactory.initElements(driver, BackgroundColorChangePage.class);
	}

	@Given("^Set SkyBlue Background button exists$")
	public void set_skyBlue_background_button_exists() {
		driver.get("http://techfios.com/test/101/");
		String expectedButtonName = "Set SkyBlue Background";
		String actualButtonName = driver.findElement(By.xpath("//button[text()='Set SkyBlue Background']")).getText();
		Assert.assertEquals(expectedButtonName, actualButtonName);
	}

	@When("^I click on the button$")
	public void i_click_on_the_button() {
		backgroundColorChangePage.clickSkyBlueButton();
		Assert.assertTrue("The button is not enabled!",
				driver.findElement(By.xpath("//button[text()='Set SkyBlue Background']")).isEnabled());
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		Assert.assertTrue("The button is not enabled!",
				driver.findElement(By.xpath("//button[text()='Set SkyBlue Background']")).isEnabled());
	}

	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() {
		driver.get("http://techfios.com/test/101/");
		String expectedButtonName = "Set White Background";
		String actualButtonName = driver.findElement(By.xpath("//button[text()='Set White Background']")).getText();
		Assert.assertEquals(expectedButtonName, actualButtonName);
	}

	@When("^I click on the Set White Background button$")
	public void i_click_on_the_set_white_background_button() {
		backgroundColorChangePage.clickSkyBlueButton();
		backgroundColorChangePage.clicksWhiteButton();
		Assert.assertTrue("The button is not enabled!",
				driver.findElement(By.xpath("//button[text()='Set White Background']")).isEnabled());
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		Assert.assertTrue("The button is not enabled!",
				driver.findElement(By.xpath("//button[text()='Set White Background']")).isEnabled());
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
