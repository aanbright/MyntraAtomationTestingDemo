package myntra.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import myntra.Utilities.DriverSetup;
import myntra.WebElement.MyntraLoginpageElements;

public class MyntraLoginpageActions {

	MyntraLoginpageElements myntraLoginpageElements;

	public MyntraLoginpageActions() {

		this.myntraLoginpageElements = new MyntraLoginpageElements();

		// initElements(WebDriver driver, Object page)
		PageFactory.initElements(DriverSetup.chromeDriver, myntraLoginpageElements);

	}

	public void getMyntraLoginPage() {
		DriverSetup.chromeDriver.get("https://www.myntra.com/login?");
		DriverSetup.chromeDriver.manage().window().maximize();
		DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void inputPhoneNumber(String phoneTextbox) {
		myntraLoginpageElements.phoneTextbox.sendKeys(phoneTextbox);

	}

	public void clickContinueSubmitButton() {
		myntraLoginpageElements.continueSubmitButton.click();

	}

	
	public String errorMessage() {
		String error = myntraLoginpageElements.errorMessage.getText();
		return error;
	}

}
/*	
public void selectRememberUserId() {
	myntraLoginpageElements.rememberUserId.click();
}

public void clickSubmitButton() {
	loginElements.submitButton.click();
}

*/