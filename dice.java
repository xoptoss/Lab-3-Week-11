package mainPackage;
import java.util.Random;
public class dice {

	private int newValue,total,newBounces;
	int value;	
	Random random = new Random();

	public dice(int Bounces)
	{
		Bounces = newBounces;
	}

	public int Throw(int Bounces)
	{			
		Bounces=total;		
		do
		{
			value = newValue+random.nextInt(6)+1;			
			total--;		
		}while(Bounces>0);	
		newValue = value/Bounces;	
		return newValue;
	}

	public int Throw()
	{
		newValue = random.nextInt(6)+1;
		return newValue;
	}

	public int Value()
	{
		value = newValue;
		return value;
	}
}
