import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		Dice dice1 = new Dice(6);
		Dice dice2 = new Dice(6);
		Dice dice3 = new Dice(6);
		
		Characters character = new Characters();
		CharactersClass charclass = new CharactersClass("Dick", 2, 10, 16);
		
		/* commented out to have cleaner console output
		
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		int roll3 = dice3.roll();
		
		int sum = roll1 + roll2 + roll3;
		
		System.out.printf("Rolled 3 dice - %s, %s and %s. Total sum of %s.",roll1,roll2,roll3,sum);
		System.out.println();
		System.out.println("---------------------------------------------");
		*/
		
		//characters stuff
		
		int characterindex = character.randomIndexOfCharacter();
		String gender = "";
		
		System.out.println(character.randomCharacter(characterindex));
		
		System.out.println(charclass.randomClass());
		
		System.out.println(charclass.getStrength());
		System.out.println(charclass.getHealthpoints());
		System.out.println(charclass.getDexterity());
		
		gender = (characterindex <= (Characters.getLength()/2) -1) ? "male" : "female";
		System.out.println(gender);
		
		//character.modifyStrength(2.0);  
		
	}
	
}