import java.util.Random;
import java.math.*;

public class Dice{
	
	public int sides;
	
	public Dice(){
			sides = 6;
	}
	
	public Dice(int sides){
		this.sides = sides;
	}
	
	public int roll(){
		int roll = (int) (Math.random() * sides + 1);
		return roll;
	}
	
}