/**
 * @author William Mueller
 *gangity gang i would come up with a rhyme but gangity gang i do not seem to have the time
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
		
		System.out.println("The sum is: " + sum(num1, num2));
		
	}

	public static int sum(int x, int y)
	{
		return x + y;
	}
	
}

