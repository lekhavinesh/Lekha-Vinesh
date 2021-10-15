package functions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestMonefy extends Base{
  
  @Test
  public void MonefyTestVerifyCategories() {
	 MonefyTest mt = new MonefyTest();
	 mt.verifyCategories();
  }
  
  @Test
  public void MonefyTestverifyAddAccountOptions() {
	 MonefyTest mt = new MonefyTest();
	 mt.verifyAddAccountOptions();
  }
  
  @Test
  public void MonefyTestaddExpense() {
	 MonefyTest mt = new MonefyTest();
	 mt.addExpense();
  }
 
}
