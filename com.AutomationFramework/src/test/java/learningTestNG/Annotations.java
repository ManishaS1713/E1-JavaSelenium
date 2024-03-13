package learningTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void test1() {
  Reporter.log("this is test1",true);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("this is beforemethod",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("this is aftermthod",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("this is beforeclass",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("this is afterclass",true);
  }
  

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("this is beforetest",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("this is afterTest",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("this is beforesuite",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("this is aftersuite",true);
  }

  @Test
  public void test2() {
  Reporter.log("this is test1",true);
  }
 
}
