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
	
	//first half of an array - male names, second half - female, it's ok to add more names as long as it's even
	static String[] names = new String[] {"Arthur", "Edward", "Greg", "Wilhelm", "Kate", "Sophia", "Helga", "Mona"};
	private String[] classes = new String[] {"warrior", "berserk", "rogue", "archer", "druid"};
	
	public Character ()
	{
		name = "n";
		strength = 100;
		healthpoints = 100;
		dexterity = 100;
	}
	
	public void modifyStrength(double str)
	{
		strength *= str;
	}
	public void modifyHealth(double hp)
	{
		healthpoints *= hp;
	}
	public void modifyDexterity(double dex)
	{
		dexterity *= dex;
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
	
//	public int getIndex(String n){
//		int index = Arrays.asList(names).indexOf(n);
//		return index;
//	}
	public static int getLength()
	{
		return names.length;
	}

	public int randomIndexforClass(){
		int number = (int) (Math.random() * classes.length);
		return number;
	}
	public String randomClass(int index){
		return classes[index];
	}
	

}