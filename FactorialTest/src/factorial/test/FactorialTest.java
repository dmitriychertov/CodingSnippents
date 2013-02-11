package factorial.test;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		int number;
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the number of finding factorial");

			// Read the number of finding factorial
			number = reader.nextInt();
			if (number == -1) {
				break;
			}
			System.out.println("The factorial is: " + factorial(number));
		}
	}

	/**
	 * Obtain the factorial of given number
	 *
	 * @param number
	 * @return factorial value of given number
	 */
	public static BigInteger factorial(int number) {
		// Note that we have used BigInteger to store the factorial value.
		BigInteger factValue = BigInteger.ONE;

		for (int i = 2; i < number; i++) {
			factValue = factValue.multiply(BigInteger.valueOf(i));
		}
		return factValue;
	}

}
