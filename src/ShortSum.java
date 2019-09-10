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
		double num1 = kb.nextInt();
		
		System.out.print("Please enter another number: ");
		double num2 = kb.nextInt();
		
		System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1+num2));
		System.out.println("The difference of " + num1 + " and " + num2 + " is: " + (num1-num2));
		System.out.println("The product of " + num1 + " and " + num2 + " is: " + (num1*num2));
		System.out.println("The quotient of " + num1 + " and " + num2 + " is: " + (num1/num2));
		
	}

}

