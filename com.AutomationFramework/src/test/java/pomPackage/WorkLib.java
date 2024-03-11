package pomPackage;

import java.util.Random;


public class WorkLib extends BaseTest1 {

	public int randomNumber()
	{
		Random r=new Random();
		int no = r.nextInt(1000);
		return no;
		
	}
	
	
}
