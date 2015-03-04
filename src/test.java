
public class test {
	public static void main(String[] args) {

		Dice dice1 = new Dice(6);
		Dice dice2 = new Dice(6);
		Dice dice3 = new Dice(6);
		
		Character character = new Character();
		
		Weapon weapon = new Weapon();
		
		// commented out to have cleaner console output
		
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		int roll3 = dice3.roll();
		
		int sum = roll1 + roll2 + roll3;
		
		System.out.printf("Rolled 3 dice - %s, %s and %s. Total sum of %s.",roll1,roll2,roll3,sum);
		System.out.println();
		System.out.println("---------------------------------------------");
		//*/
		
		//characters stuff
		
		int characterindex = character.randomIndexOfCharacter();
		String gender = "";
		int classindex = character.randomIndexforClass();
		String charclass = character.randomClass(classindex);
		
		gender = (characterindex <= (Character.getLength()/2) -1) ? "male" : "female";
		
		System.out.println(character.randomCharacter(characterindex) + " - a " + gender + " " + charclass);
		
		//stats modified by gender and class
		if (gender == "male"){
			character.modifyStrength(1.2);
			character.modifyHealth(1.5);
			character.modifyDexterity(.8);
		} else { 
			character.modifyStrength(.8);
			character.modifyDexterity(1.4);
		}
		
		if (charclass == "warrior"){
			character.modifyStrength(1.5);
			character.modifyHealth(1.5);
		} else if (charclass == "berserk"){
			character.modifyStrength(2);
		} else if (charclass == "rogue"){
			character.modifyHealth(2);
		} else if (charclass == "archer"){
			character.modifyHealth(.7);
			character.modifyStrength(.5);
			character.modifyDexterity(2);
		} else if (charclass == "druid"){
			character.modifyHealth(4);
			character.modifyStrength(.2);
			character.modifyDexterity(.5);
		}
		  
		System.out.println("Strength: \t" + character.getStrength());
		System.out.println("Health: \t" + character.getHealthpoints());
		System.out.println("Dexterity: \t" + character.getDexterity());
		
		
		
		
		System.out.println("---------------------------------------------");
		
		
		weapon.setRandomWeaponType(weapon.randomIndexOfType());
		System.out.println(weapon.getName() + " " + weapon.getType());
		
		weapon.randomWeaponDamage();
		System.out.println("Damage: " + weapon.randomWeaponDamage());
	}
	
}