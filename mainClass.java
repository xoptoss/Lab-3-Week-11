package mainPackage;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dice Dice = new dice(3);
		
		Dice.Throw(3);
		Dice.Value();
		System.out.println(Dice.value);
		
	}

}
