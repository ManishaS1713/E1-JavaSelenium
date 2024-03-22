package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListner;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;

@Listeners (CustomListner.class)
public class ValidLoginTestCase extends BaseTest 
{
	@Test
	public void loginTestCase() throws IOException, InterruptedException 
	{
		//to load the non-static member from Flib class
		Flib flib=new Flib();
		
		LoginPage lp= new LoginPage(driver);
			
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		
		Thread.sleep(2000);
		
		HomePage hp=new HomePage(driver);
		hp.getLogoutLink().click();
	}

}
