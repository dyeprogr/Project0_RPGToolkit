package rpgToolKit;

public class Weapon {

	private static String type;
	private static String name;
	public static int damage;
	private static String description;
	private static String equipable;
	private static String imageName;
	
	private static String[] weaponType = new String[]{"sword", "mace", "gun", "spear", "wand", "bow", "axe"};
	
	//easily expendable lists of names
	private static String[] swordName = new String[]{"Excalibur", "Carsomyr", "Szczerbiec"};
	private static String[] maceName = new String[]{"Skullcrasher", "Stupefier", "Mauler"};
	private static String[] gunName = new String[]{"Glock", "Magnum", "AK47"};
	private static String[] spearName = new String[]{"Blackbiter", "Ixil", "Toothpick"};
	private static String[] wandName = new String[]{"HarryPotter's", "Gandalf's", "BlackMagic"};
	private static String[] bowName = new String[]{"Tulgan", "Indian", "Mongolian"};
	private static String[] axeName = new String[]{"Azuredge", "Stonefire", "Mauletar"};
	
	public Weapon ()
	{
		type = "";
		name = "";
		damage = 100;
		equipable = "";
		description = "";
		imageName = "";
	}
	
	public static String getType(){
		return type;
	}
	public String getName(){
		Weapon.setRandomWeaponNameAndInfo();
		return name;
	}
	public static String getNameAndType(){
		new Weapon();
		setRandomWeaponType();
		setRandomWeaponNameAndInfo();
		
		String nameAndType = name + " " + type;
		return nameAndType;
	}
	public static int getDamage(){
		setRandomWeaponDamage();
		return damage;
	}
	public static String getEquipableInfo(){
		return equipable;
	}
	public static String getDescription(){
		return description;
	}
	public static String getImageName(){
		return imageName;
	}

	//ugly way to get damage in range between 50 and 100
	public static void setRandomWeaponDamage(){
		int damageModifier = 0;
		do{
		damageModifier = (int) (Math.random() * damage);
        } while (damageModifier <= 50);
		damage = damageModifier;
	}
	
	public static void setRandomWeaponType(){
		int number = (int) (Math.random() * weaponType.length);
		type = weaponType[number];
	}
	
	private static void setRandomWeaponNameAndInfo(){
		if (type == "sword"){
			int index = (int) (Math.random() * swordName.length);
			name = swordName[index];
			description = "Slash your enemies with a sharp edge of a sword";
			equipable = "Not equipable by Archer and Droid";
		}else if (type == "mace"){
			int index = (int) (Math.random() * maceName.length);
			name = maceName[index];
			description = "Smash the head of your enemy with this blunt mace";
			equipable = "Equipable by Warrior and Berserk";
		}else if (type == "gun"){
			int index = (int) (Math.random() * gunName.length);
			name = gunName[index];
			description = "Shoot your enemy from a distance";
			equipable = "Equipable by Rogue and Archer";
		}else if (type == "spear"){
			int index = (int) (Math.random() * spearName.length);
			name = spearName[index];
			description = "Stab your enemy with this pointy weapon";
			equipable = "Equipable by Warror and Rogue";
		}else if (type == "wand"){
			int index = (int) (Math.random() * wandName.length);
			name = wandName[index];
			description = "Throw magic spells at enemy with this magic wand";
			equipable = "Equipable by Druid";
		}else if (type == "bow"){
			int index = (int) (Math.random() * bowName.length);
			name = bowName[index];
			description = "Shoot your enemy from a distance";
			equipable = "Equipable by Archer";
		}else if (type == "axe"){
			int index = (int) (Math.random() * axeName.length);
			name = axeName[index];
			description = "Cut your enemy into seperate pieces with one swing";
			equipable = "Not equipable by Archer and Druid";
		}
		
		//for image filename
		if (type.equals("sword")){
			imageName = "sword";
			if (name.equals("Excalibur")){
				imageName = imageName + "1" + ".png";
			} else if (name.equals("Carsomyr")){
				imageName = imageName + "2" + ".png";
			} else if (name.equals("Szczerbiec")){
				imageName = imageName + "3" + ".png";
			}
		} else if (type.equals("mace")) {
			imageName = "mace";
			if (name.equals("Skullcrasher")){
				imageName = imageName + "1" + ".png";				
			} else if (name.equals("Stupefier")){
				imageName = imageName + "2" + ".png";
			} else if (name.equals("Mauler")){
				imageName = imageName + "3" + ".png";
			}
		} else if (type.equals("gun")) {
			imageName = "gun";
			if (name.equals("Glock")){
				imageName = imageName + "1" + ".png";				
			} else if (name.equals("Magnum")){
				imageName = imageName + "2" + ".png";
			} else if (name.equals("AK47")){
				imageName = imageName + "3" + ".png";
			}
		} else if (type == "spear") {
			imageName = "spear";
			if (name == "Blackbiter"){
				imageName = imageName + "1" + ".png";				
			} else if (name == "Ixil"){
				imageName = imageName + "2" + ".png";
			} else if (name == "Toothpick"){
				imageName = imageName + "3" + ".png";
			}
		} else if (type == "wand") {
			imageName = "wand";
			if (name == "HarryPotter's"){
				imageName = imageName + "1" + ".png";				
			} else if (name == "Gandalf's"){
				imageName = imageName + "2" + ".png";
			} else if (name == "BlackMagic"){
				imageName = imageName + "3" + ".png";
			}
		} else if (type == "bow") {
			imageName = "bow";
			if (name == "Tulgan"){
				imageName = imageName + "1" + ".png";				
			} else if (name == "Indian"){
				imageName = imageName + "2" + ".png";
			} else if (name == "Mongolian"){
				imageName = imageName + "3" + ".png";
			}
		} else if (type == "axe") {
			imageName = "axe";
			if (name == "Azuredge"){
				imageName = imageName + "1" + ".png";				
			} else if (name == "Stonefire"){
				imageName = imageName + "2" + ".png";
			} else if (name == "Mauletar"){
				imageName = imageName + "3" + ".png";
			}
		}
	}
}
