package assignments;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Palak Tiwari
 * @since  2019-06-26
 * Calculator interface is used to provide methods to perform 
 * arithmetic operations
 */

public interface Calculator {
    
	/**
	 * @param firstNumber
	 * @param secondNumber
	 * This method is used to find the addition of two numbers
	 */
	public static void addition(int firstNumber, int secondNumber) {
		int addition = firstNumber + secondNumber;
		System.out.println("Addition is: "+addition);
	}

	/**
	 * @param firstNumber
	 * @param secondNumber
	 * This method is used to find the division of two numbers
	 */
	public static void division(int firstNumber, int secondNumber) {
		int division;
		if(secondNumber == 0) {
			throw new ArithmeticException();
			
		}
		division = firstNumber / secondNumber;
		System.out.println("Division is: " + division);
	}

	/**
	 * @param firstNumber
	 * @param secondNumber
	 * This method is used to find the subtraction of two numbers
	 */
	public static void subtraction(int firstNumber, int secondNumber) {
		int subtraction;
		subtraction = firstNumber - secondNumber;
		System.out.println("Subtraction is: " + subtraction);

	}
	
	/**
	 * @param firstNumber
	 * @param secondNumber
	 * This method is used to find the multiplication of two numbers
	 */
	public static void multiplication(int firstNumber, int secondNumber) {
		int multiplication = firstNumber * secondNumber;
		System.out.println("Multiplication is: " + multiplication);
	}
	
  /**
    * 
    * @param args 
    * Main method to perform the arithmetic operations
    */
	public static void main(String[] args) {
		/*variable userChoice is used to take choice from the user*/
		int userChoice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
	   /*firstNumber variable is used to store the first value entered by user*/
		int firstNumber = scanner.nextInt();
		/*secondNumber variable is used to store the second value entered by user*/
		int secondNumber = scanner.nextInt();
		System.out.println("Please select the operations to perform");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		userChoice = scanner.nextInt();
	
		/*closes the scanner*/
		scanner.close();
		switch (userChoice) {
		case 1:
			/*calls method to perform addition */
			addition(firstNumber, secondNumber);
			break;

		case 2:
			/*calls method to perform subtraction */
			subtraction(firstNumber, secondNumber);
			break;

		case 3:
			/*calls method to perform division */
			division(firstNumber, secondNumber);
			break;

		case 4:
			/*calls method to perform multiplication */
			multiplication(firstNumber, secondNumber);
			break;

		default:
			System.out.println("Please enter valid input");
			break;
		}

	}

}
