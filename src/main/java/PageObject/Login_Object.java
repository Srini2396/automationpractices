package PageObject;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Object extends BasePage {
	
	@FindBy(xpath = "//*[text()='Women']")
	private WebElement Women;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dresses;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement tshirts;
	
	@FindBy(id = "newsletter-input")
	private WebElement email_ID;
	
	@FindBy(xpath = "//*[@class='form-group']/button")
	private WebElement button;
	
	@FindBy(xpath = "//*[@class='alert alert-success']")
	private WebElement popup;
	
	@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']//li[1]")
	private WebElement small;
	
	@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']//li[2]")
	private WebElement medium;
	
	@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']//li[3]")
	private WebElement large;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]")
	private WebElement dress;
	
	@FindBy(xpath = "//*[text()='Add to cart']")
	private WebElement addcart;
	
	@FindBy(xpath = "//*[@class='ajax_cart_product_txt ']")
	private WebElement successfull;
	
	public Login_Object() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return Women;
	}

	public WebElement getDresses() {
		return Dresses;
	}

	public WebElement getTshirts() {
		return tshirts;
	}
	public String naviwomen()
	{
		Women.click();
		return driver.getTitle();
	}
	public String navidress()
	{
		Dresses.click();
		return driver.getTitle();
	}
	public String navitshirts()
	{
		tshirts.click();
		return getTITLE();
	}
	public void newsletter()
	{
	 int random = new Random().nextInt(200);
	 String email = "srini" + random + "@gmail.com";
	 email_ID.sendKeys(email);
	 button.click();
	 System.out.println(email);
	}
	public String alert()
	{
		return popup.getText();
	}
	public WebElement size()
	{
		Dresses.click();
	return small;
	}
	public WebElement msize()
	{
		Dresses.click();
		return medium;
	}
	public WebElement lsize()
	{
		Dresses.click();
		return large;
	}
	public void getAddtoCart()
	{
	   Dresses.click();
	   Actions act = new Actions(driver);
	   act.moveToElement(dress).build().perform();
	   addcart.click();
	}
	public String Success()
	{
		
		return successfull.getText();
	}


	

}
