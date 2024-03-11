package pomPackage;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest1 bt=new BaseTest1();
		bt.setUp();
		
		Flib1 flib=new Flib1();
		
		LoginPage lp= new LoginPage(driver);
		/* we cover these script in LoginPage class as a validLoginMethod()
		 
		lp.getUsnTb().sendKeys(flib.readPropertyData(PROP_PATH, "username"));
		Thread.sleep(1000);
		lp.getPwdTb().sendKeys(flib.readPropertyData(PROP_PATH, "password"));
		Thread.sleep(1000);
		lp.getLoginButton().click();
		*/
				
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		
		Thread.sleep(2000);
		
		HomePage hp=new HomePage(driver);
		hp.getLogoutLink().click();
	}

}
