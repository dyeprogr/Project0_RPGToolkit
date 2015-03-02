import java.util.Hashtable;
import java.util.Scanner;
import java.util.Random;
import java.math.*;


public class Characters {
	
	Hashtable<Integer, String> characters = new Hashtable<Integer, String>();
	
	private String[] names = new String[] {"Arthur", "Edward", "Greg", "Wilhelm", "Kate", "Sophia", "Helga", "Mona"};
	
	
	public String randomCharacter(){
		int number = (int) (Math.random() * names.length);
		return names[number];
	}
	
	
	
	
}
