
public class Weapon {

	private String type;
	private String name;
	public int damage;
	private String description;
	private String equipable;
	

	
	private String[] weaponType = new String[]{"sword", "mace", "gun", "spear", "wand", "bow", "axe"};
	
	//easily expendable lists of names
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
		description = "";
	}
	

	
	public String getType(){
		return type;
	}
	public String getName(){
		this.setRandomWeaponNameAndInfo();
		return name;
	}
	public int getDamage(){
		return damage * setRandomWeaponDamage();
	}
	public String getEquipableInfo(){
		return equipable;
	}
	public String getDesctiption(){
		return description;
	}

	//ugly way to get damage in range between 50 and 100
	public int setRandomWeaponDamage(){
		int modifier = 0;
		do{
		modifier = (int) (Math.random() * damage);
        } while (modifier <= 50);
		return modifier;
	}
	
	public void setRandomWeaponType(){
		int number = (int) (Math.random() * weaponType.length);
		type = weaponType[number];
	}
	
	//private String[] classes = new String[] {"warrior", "berserk", "rogue", "archer", "druid"};

	private void setRandomWeaponNameAndInfo(){
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
		
	}
	
}
