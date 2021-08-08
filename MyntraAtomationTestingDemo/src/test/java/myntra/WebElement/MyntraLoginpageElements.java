package myntra.WebElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraLoginpageElements {
	
	@FindBy(xpath= "//input[@autocomplete=\"new-password\" and @maxlength=\"10\"]]")
	public WebElement phoneTextbox;
	
	@FindBy(xpath= "//div[@class='submitBottomOption']")
	public WebElement continueSubmitButton;
	
	@FindBy(xpath= "//div[@class='errorContainer']")
	public WebElement errorMessage;
}
