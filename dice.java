
package mainPackage;
import java.util.Random;
public class dice {

	int value,newValue,total,newBounces;
	Random random = new Random();
	
	public dice(int Bounces)
	{
		Bounces = newBounces;
	}

	public int Throw(int Bounces)
	{			
		total=Bounces;		
		do
		{
			newValue = random.nextInt(6)+1;
			value=value+newValue;
			Bounces--;		
		}while(Bounces>0);	

		newValue = value/total;	
		return newValue;
	}

	public int Value()
	{
		value = newValue;
		return value;
	}
}
