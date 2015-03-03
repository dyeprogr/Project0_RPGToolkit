import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Random;
import java.math.*;


public class Character {
	
	private String name;
	private double strength;
	private double healthpoints;
	private double dexterity;
	
	//Hashtable<Integer, String> characters = new Hashtable<Integer, String>();
	
	static String[] names = new String[] {"Arthur", "Edward", "Greg", "Wilhelm", "Kate", "Sophia", "Helga", "Mona"};
	private String[] classes = new String[] {"warrior", "berserk", "rogue", "archer", "druid"};
	
	public Character ()
	{
		
	}
	
	public Character (String n, double str, double hp, double dex)
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
	
	
	public int randomIndexOfCharacter(){
		int number = (int) (Math.random() * names.length);
		return number;
	}
	public String randomCharacter(int index){
		return names[index];
	}
	
	public int getIndex(String n){
		int index = Arrays.asList(names).indexOf(n);
		return index;
	}
	public static int getLength()
	{
		return names.length;
	}

	public String randomClass(){
		int number = (int) (Math.random() * classes.length);
		return classes[number];
	}
	

}