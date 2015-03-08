package rpgToolKit;

public class Character {
	
	private static String name;
	private static String gender;
	private static String charclass;
	private static int strength;
	private static int health;
	private static int dexterity;
	private static String imageName;
	
	private static int nameindex;
	private static int classindex;
	
	//first half of an array - male names, second half - female, it's ok to add more names as long as it's even
	static String[] names = new String[] {"Arthur", "Edward", "Greg", "Wilhelm", "Kasimir", "Kate", "Sophia", "Helga", "Mona", "Julia"};

	private static String[] classes = new String[] {"warrior", "berserk", "rogue", "archer", "druid"};
	
	public Character ()
	{
		name = "n";
		gender = "";
		charclass = "";
		strength = 100;
		health = 100;
		dexterity = 100;
		imageName = "";
	}
	
	public static String getName(){
		return name;
	}
	public static String getGender(){
		return gender;
	}
	public static String getCharClass(){
		return charclass;
	}

	public static int getStrength()
	{
		return strength;
	}
	public static int getHealthpoints()
	{
		return health;
	}
	public static int getDexterity()
	{
		return dexterity;
	}
	public static String getImageName(){
		return imageName;
	}

	public static String getNameGenderAndClass(){
		setRandomNameAndClass();
		modifyStatsByGenderAndClass();
		String nameGenderAndClass = (getName() + " - a " + getGender() + " " + getCharClass()); 
		return nameGenderAndClass;
	}
	
  	public static void setRandomNameAndClass(){
  		new Character();
  		
  		nameindex = (int) (Math.random() * names.length);
		classindex = (int) (Math.random() * classes.length);
		
		name = names[nameindex];
		charclass = classes[classindex];
		
		gender = (nameindex <= (names.length/2) -1) ? "male" : "female";
		
		//for image filename
		int characterIndex = (int) (Math.random() * names.length/2 + 1);
		if (gender == "male"){
			imageName = "ch" + "1" + characterIndex + ".png";
		} else {
			imageName = "ch" + "2" + characterIndex + ".png";
		}
	}

	//stats modified by gender and class
  	public static void modifyStatsByGenderAndClass(){
  	
  		if (gender == "male"){
  			strength *= 1.2;
  			health *= 1.5;
  			dexterity *= .8;
  		} else { 
  			strength *= .8;
  			dexterity *= 1.4;
  		}
	
  		if (charclass == "warrior"){
  			strength *= 1.5;
  			health *= 1.5;
  		} else if (charclass == "berserk"){
  			strength *= 2;
  		} else if (charclass == "rogue"){
  			health *= 2;
  		} else if (charclass == "archer"){
  			health *= .7;
  			strength *= .5;
  			dexterity *= 2;
  		} else if (charclass == "druid"){
  			health *= 4;
  			strength *= .2;
  			dexterity *= .5;
  		}
  	}
}