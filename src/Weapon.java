import java.util.Random;
import java.math.*;


public class Weapon {

	private String type;
	private String name;
	public int damage;
	private String equipable;

	
	private String[] weaponType = new String[]{"sword", "mace", "gun", "spear", "wand", "bow", "axe"};
	
	//expendable lists of names
	private String[] swordName = new String[]{"Excalibur", "Carsomyr", "Szczerbiec", "Silver"};
	private String[] maceName = new String[]{"Skullcrasher", "Stupefier", "Mauler"};
	private String[] gunName = new String[]{"Glock", "Magnum", "AK47"};
	private String[] spearName = new String[]{"Blackbiter", "Ixil", "Toothpick"};
	private String[] wandName = new String[]{"HarryPotter's", "Gandalf's", "BlackMagic"};
	private String[] bowName = new String[]{"Tulgan", "Indian", "Mongolian"};
	private String[] axeName = new String[]{"Azuredge", "Stonefire", "Mauletar"};
	
	public Weapon ()
	{
		type = "";
		name = "";
		damage = 100;
		equipable = "";
	}
	
	
	
	public int randomIndexOfType(){
		int number = (int) (Math.random() * weaponType.length);
		return number;
	}
	public void setRandomWeaponType(int index){
		type = weaponType[index];
		
	}
	

	public void setRandomWeaponName(){
		if (type == "sword"){
			int index = (int) (Math.random() * swordName.length);
			name = swordName[index];
		}else if (type == "mace"){
			int index = (int) (Math.random() * maceName.length);
			name = maceName[index];
		}else if (type == "gun"){
			int index = (int) (Math.random() * gunName.length);
			name = gunName[index];
		}else if (type == "spear"){
			int index = (int) (Math.random() * spearName.length);
			name = spearName[index];
		}else if (type == "wand"){
			int index = (int) (Math.random() * wandName.length);
			name = wandName[index];
		}else if (type == "bow"){
			int index = (int) (Math.random() * bowName.length);
			name = bowName[index];
		}else if (type == "axe"){
			int index = (int) (Math.random() * axeName.length);
			name = axeName[index];
		}
		
		
	}
	

	public String getType(){
		return type;
	}
	
	public String getName(){
		this.setRandomWeaponName();
		return name;
	}
	

	
//	System.out.println(weapon.setRandomWeaponType(weapon.randomIndexOfType()));
//
//	
//	weapon.setRandomWeaponName();
//	System.out.println(weapon.getName());
	
//		public int randomIndexOfCharacter(){
//			int number = (int) (Math.random() * names.length);
//			return number;
//		}
//		public String randomCharacter(int index){
//			return names[index];
//		}
		
		
		
		
	
	
//	public int randomIndexOfWeaponName(String which){
//		
//		int number = (int) (Math.random() * which.length());
//		return number;
//	}
	
	
	
	
	
	//ugly way to get damage in range between 50 and 100
	public int randomWeaponDamage(){
		int modifier = 0;
		do{
		modifier = (int) (Math.random() * damage);
        } while (modifier <= 50);
		return modifier;
	}
	
	public int getDamage(){
		return damage * randomWeaponDamage();
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
}
