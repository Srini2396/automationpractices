package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Login_Object;



public class LoginTest {

	Login_Object lt;

	public LoginTest() {
		lt = new Login_Object();
	}

	@Test (enabled = false)
	public void verifyWomen() {
		Assert.assertTrue(lt.getWomen().isDisplayed());
	}

	@Test (enabled = false)
	public void verifyDresses() {
		Assert.assertTrue(lt.getDresses().isDisplayed());
	}

	@Test (enabled = false)
	public void verifyTshirts() {
		Assert.assertTrue(lt.getTshirts().isDisplayed());
	}
	
	@Test (enabled = false)
	public void navititle()
	{
		System.out.println(lt.naviwomen());
		System.out.println(lt.navidress());
		System.out.println(lt.navitshirts());
	}
	
    @Test (enabled = false)
	public void subscribe()
	{
      lt.newsletter();
      System.out.println(lt.alert());
	}
    @Test (enabled = false)
    public void sizes() 
    {
    	System.out.println(lt.size().getText());
    	System.out.println(lt.msize().getText());
    	System.out.println(lt.lsize().getText());
 }
    @Test
    public void AddToCart()
    {
    lt.getAddtoCart();
    System.out.println(lt.Success());
}
}


