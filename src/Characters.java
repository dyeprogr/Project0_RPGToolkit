import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Random;
import java.math.*;


public class Characters {
	
	Hashtable<Integer, String> characters = new Hashtable<Integer, String>();
	
	static String[] names = new String[] {"Arthur", "Edward", "Greg", "Wilhelm", "Kate", "Sophia", "Helga", "Mona"};
	
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
	
}
