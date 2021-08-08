package myntra.WebElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraHomepageElements {
	@FindBy(xpath="//a[contains(@href,'/shop/men')]/@class")
	public WebElement menButton;

	@FindBy(xpath = "//*[@id='desktop-header-cnt']/div[2]/nav/div/div[2]/div/a")
	public WebElement womenButton;

	@FindBy(xpath="//a[contains(@href,'/shop/kids')]/@class")
	public WebElement kidsButton;

}
