package myntra.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import myntra.Utilities.DriverSetup;
import myntra.WebElement.MyntraInfantspageElements;



public class MyntraInfantspageActions {
	
	MyntraInfantspageElements myntraInfantspageElements;

	public MyntraInfantspageActions() {

		this.myntraInfantspageElements = new MyntraInfantspageElements();

		// initElements(WebDriver driver, Object page)
		PageFactory.initElements(DriverSetup.chromeDriver, myntraInfantspageElements);

	}

	public void getUpsLoginPage() {
		DriverSetup.chromeDriver.get("https://www.myntra.com/inf-tki");
		DriverSetup.chromeDriver.manage().window().maximize();
		DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void clicksBoysRadioButton() {
		myntraInfantspageElements.boysRadioButton.click();

	}
	public void clickCheckboxTshirts() {
		myntraInfantspageElements.checkboxTshirts.click();
	}

	public void clicksCheckboxHnM() {
		myntraInfantspageElements.checkboxHnM.click();
	}
	public void clickImageBabyTshirt() {
		myntraInfantspageElements.imageBabyTshirt.click();
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






