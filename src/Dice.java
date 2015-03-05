
public class Dice{
	
	
	static Dice die1 = new Dice();
	static Dice die2 = new Dice();
	static Dice die3 = new Dice();
	
	public int sides;
	public int result;
	
	public Dice(){
			sides = 6;
			result = 0;
	}
	
	public Dice(int sides){
		this.sides = sides;
	}
	
	public void roll(){
		result = (int) (Math.random() * sides + 1);
	}
	
	public static int die1Result(){
		return die1.result;
	}
	public static int die2Result(){
		return die2.result;
	}
	public static int die3Result(){
		return die3.result;
	}
	
	public static int diceSum(){
		die1.roll();
		die2.roll();
		die3.roll();
		int sum = die1.result + die2.result + die3.result; 
		return sum;
	}
	
}