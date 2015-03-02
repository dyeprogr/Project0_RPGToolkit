import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		Dice dice1 = new Dice(6);
		Dice dice2 = new Dice(6);
		Dice dice3 = new Dice(6);
		
		Characters character = new Characters();
		
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		int roll3 = dice3.roll();
		
		int sum = roll1 + roll2 + roll3;
		
		System.out.printf("Rolled 3 dice - %s, %s and %s. Total sum of %s.",roll1,roll2,roll3,sum);
		
		System.out.println();
		
		System.out.print(character.randomCharacter());
		
	}
	
}