import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		Dice dice1 = new Dice(6);
		Dice dice2 = new Dice(6);
		Dice dice3 = new Dice(6);
		
		System.out.println("Dice number 1 rolled the value: " + dice1.roll());
		System.out.println("Dice number 2 rolled the value: " + dice2.roll());
		System.out.println("Dice number 3 rolled the value: " + dice3.roll());
	}
}