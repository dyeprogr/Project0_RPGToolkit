
public class test {
	public static void main(String[] args) {

		Dice dice1 = new Dice(6);
		Dice dice2 = new Dice(6);
		Dice dice3 = new Dice(6);
		
		Character character = new Character();
		
		Weapon weapon = new Weapon();
		
		
		// Section1 - Dice
		
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		int roll3 = dice3.roll();
		
		int sum = roll1 + roll2 + roll3;
		
		System.out.printf("Rolled 3 dice - %s, %s and %s. Total sum of %s.",roll1,roll2,roll3,sum);
		System.out.println();

		System.out.println("---------------------------------------------");
		
		
		// Section2 - Character
		
		character.setRandomNameAndClass();
		character.modifyStatsByGenderAndClass();
		
		System.out.println(character.getName() + " - a " + character.getGender() + " " + character.getCharClass());
		
		System.out.println("Strength: \t" + character.getStrength());
		System.out.println("Health: \t" + character.getHealthpoints());
		System.out.println("Dexterity: \t" + character.getDexterity());
		
		System.out.println("---------------------------------------------");
		
		
		// Section3 - Weapon
		
		weapon.setRandomWeaponType();
		System.out.println(weapon.getName() + " " + weapon.getType());
		
		System.out.println("Damage: \t" + weapon.setRandomWeaponDamage());
	}
	
}