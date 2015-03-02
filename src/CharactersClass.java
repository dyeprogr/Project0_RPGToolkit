
public class CharactersClass {

	private String name;
	private double strength;
	private double healthpoints;
	private double dexterity;
	
	public CharactersClass (String n, double str, double hp, double dex)
	{
		name = n;
		strength = str;
		healthpoints = hp;
		dexterity = dex;
	}
	
	public void setName(String n)
	{
		String name = n;
	}

	public double setStrength(double str)
	{
		return strength = str;
	}
	public double setHealth(double hp)
	{
		return healthpoints = hp;
	}
	public double setDexterity(double dex)
	{
		return dexterity = dex;
	}
	
	
	private String[] classes = new String[] {"warrior", "berserk", "rogue", "archer", "druid"};
	
	public String randomClass(){
		int number = (int) (Math.random() * classes.length);
		return classes[number];
	}
	
}
