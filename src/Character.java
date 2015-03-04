
public class Character {
	
	private String name;
	private String gender;
	private String charclass;
	private int strength;
	private int health;
	private int dexterity;
	
	private int nameindex;
	private int classindex;
	
	//first half of an array - male names, second half - female, it's ok to add more names as long as it's even
	static String[] names = new String[] {"Arthur", "Edward", "Greg", "Wilhelm", "Kate", "Sophia", "Helga", "Mona"};

	private String[] classes = new String[] {"warrior", "berserk", "rogue", "archer", "druid"};
	
	public Character ()
	{
		name = "n";
		gender = "";
		charclass = "";
		strength = 100;
		health = 100;
		dexterity = 100;
	}
	
	public String getName(){
		return name;
	}
	public String getGender(){
		return gender;
	}
	public String getCharClass(){
		return charclass;
	}

	public int getStrength()
	{
		return strength;
	}
	public int getHealthpoints()
	{
		return health;
	}
	public int getDexterity()
	{
		return dexterity;
	}
	
  
  	public void setRandomNameAndClass(){
  		nameindex = (int) (Math.random() * names.length);
		classindex = (int) (Math.random() * classes.length);
		
		name = names[nameindex];
		charclass = classes[classindex];
		
		gender = (nameindex <= (names.length/2) -1) ? "male" : "female";
	}
	

	//stats modified by gender and class
  	public void modifyStatsByGenderAndClass(){
  	
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