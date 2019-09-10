/**
 * @author William Mueller
 * #qwerty:P
 */

import java.util.Scanner;

public class ShortSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int num1 = kb.nextInt();
		
		System.out.print("Please enter another number: ");
		int num2 = kb.nextInt();
		
		System.out.println("The sum is: " + (num1+num2));
		
	}

}

