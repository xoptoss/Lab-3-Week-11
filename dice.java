package mainPackage;
import java.util.Random;
public class dice {

	int newValue,total,newBounces;
	int value,Bounces;

	static Random random = new Random();

	public dice(int newBounces)
	{
		Bounces = newBounces;
	}

	public int Throw(int Bounces)
	{			
		
		total=Bounces;		
		do
		{
			value = value+random.nextInt(6)+1;							
			total--;		
		}while(total>0);	

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
