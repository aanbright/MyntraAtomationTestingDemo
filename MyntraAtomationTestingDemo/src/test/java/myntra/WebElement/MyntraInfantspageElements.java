package myntra.WebElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraInfantspageElements {


	@FindBy(xpath = "//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label")
	public WebElement boysRadioButton;

	@FindBy(xpath = "//input[@type=\"checkbox\" and @value=\"Tshirts\"]")
	public WebElement checkboxTshirts;

	@FindBy(xpath = "//input[@type=\"checkbox\" and @value=\"H&M\"]")
	public WebElement checkboxHnM;
	
	@FindBy(xpath = "//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img")
	public WebElement imageBabyTshirt;
}
