package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundColorChangePage {

	WebDriver driver;

	public BackgroundColorChangePage(WebDriver driver) {
		driver = this.driver;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Set SkyBlue Background']")
	WebElement Sky_Blue_Background_Element;
	@FindBy(how = How.XPATH, using = "//button[text()='Set White Background']")
	WebElement White_Background_Element;

	public void clickSkyBlueButton() {
		Sky_Blue_Background_Element.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clicksWhiteButton() {
		White_Background_Element.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
