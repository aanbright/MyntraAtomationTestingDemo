package myntra.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import myntra.Utilities.DriverSetup;
import myntra.WebElement.MyntraHomepageElements;




public class MyntraHomepageActions {
	MyntraHomepageElements myntraHomepageElements;

	public MyntraHomepageActions() {

		this.myntraHomepageElements = new MyntraHomepageElements();

		// initElements(WebDriver driver, Object page)
		PageFactory.initElements(DriverSetup.chromeDriver, myntraHomepageElements);

	}

	public void getUpsLoginPage() {
		DriverSetup.chromeDriver.get("https://www.ups.com/lasso/login?");
		DriverSetup.chromeDriver.manage().window().maximize();
		DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void clicksMenButton() {
		myntraHomepageElements.menButton.click();

	}
	public void clicksWomenButton() {
		myntraHomepageElements.womenButton.click();
	}

	public void clicksKidsButton() {
		myntraHomepageElements.kidsButton.click();
	}
}
	
	
/*public void inputPassword(String password) {
		myntraHomepageElements.password.sendKeys(password);

	}

	public void selectRememberUserId() {
		myntraHomepageElements.rememberUserId.click();
	}



	public String errorMessage() {
		String error = myntraHomepageElements.errorMessage.getText();
		return error;
	}   

}*/



