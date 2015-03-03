
public class CharactersClass {

	private String name;
	private double strength;
	private double healthpoints;
	private double dexterity;
	
	public CharactersClass (String n, double str, double hp, double dex)
	{
		name = n;
		strength = 100;
		healthpoints = 100;
		dexterity = 100;
	}
	
	public void setName(String n)
	{
		String name = n;
	}

	public double modifyStrength(double str)
	{
		return strength = str;
	}
	public double modifyHealth(double hp)
	{
		return healthpoints = hp;
	}
	public double modifyDexterity(double dex)
	{
		return dexterity = dex;
	}
	
	public double getStrength()
	{
		return strength;
	}
	public double getHealthpoints()
	{
		return healthpoints;
	}
	public double getDexterity()
	{
		return dexterity;
	}
	
	
	private String[] classes = new String[] {"warrior", "berserk", "rogue", "archer", "druid"};
	
	public String randomClass(){
		int number = (int) (Math.random() * classes.length);
		return classes[number];
	}
	

	
}
