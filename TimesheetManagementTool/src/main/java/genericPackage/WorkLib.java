package genericPackage;

import java.util.Random;


public class WorkLib {

	public int randomNumber()
	{
		Random r=new Random();
		int no = r.nextInt(1000);
		return no;
		
	}
	
	
}
