package assignments;

import java.util.Scanner;

/**
 * @author Palak Tiwari
 * Implement methods to perform addition and subtraction
 * of two complex numbers
 */

public class Complex {
	/*_real variable stores real value of complex number*/
	private double _real;
	/*_imaginary variable stores real value of complex number*/
	private double _imaginary;

	public Complex(double _real, double _imaginary) {
		this._real = _real;
		this._imaginary = _imaginary;
	}

	/**
	 * @param complex1
	 * @param complex2
	 * @return
	 * This method is used to perform addition of two complex number
	 */
	public Complex addition( Complex complex2) {
		/*realValue stores the addition of real part of complex number*/
		double realValue = this._real + complex2._real;
		/*imaginaryValue stores the addition of imaginary part of complex number*/
		double imaginaryValue = this._imaginary + complex2._imaginary;
		return new Complex(realValue, imaginaryValue);
	}
  
	
	/**
	 * @param complex1
	 * @param complex2
	 * @return
	 * This method is used to perform subtraction of two complex number
	 */
	public Complex subtraction(Complex complex2) {
		double r = this._real - complex2._real;
		double i = this._imaginary - complex2._imaginary;
		return new Complex(r, i);
	}
 
	
	/**
	 * @param complex1
	 * @param complex2
	 * @return
	 * * This method is used to perform addition of two complex number
	 */
	public static Complex addition(Complex complex1, Complex complex2) {
		Complex complexNumber = new Complex(0, 0);
		complexNumber._real = complex1._real + complex2._real;
		complexNumber._imaginary = complex1._imaginary + complex2._imaginary;
		return new Complex(complexNumber._real, complexNumber._imaginary);
	}

	/**
	 * @param complex1
	 * @param complex2
	 * @return
	 * This method is used to perform subtraction of two complex number
	 */
	public static Complex subtraction(Complex complex1, Complex complex2) {
		Complex complexNumber = new Complex(0, 0);
		complexNumber._real = complex1._real - complex2._real;
		complexNumber._imaginary = complex1._imaginary - complex2._imaginary;
		return new Complex(complexNumber._real, complexNumber._imaginary);
	}
    
	/**
	 * @param args
	 * Program to add and subtract two complex numbers
	 * This will calculate the addition and subtraction of two complex number
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first complex number");
		System.out.println("Enter real value of first complex number");
		/*firstRealValue stores real value of first complex number*/
		double firstRealValue = scanner.nextDouble();
		System.out.println("Enter imaginary value of first complex number");
		/*firstImaginaryValue stores imaginary value of first complex number*/
		double firstImaginaryValue = scanner.nextDouble();
		System.out.println("Enter second complex number");
		System.out.println("Enter real value of second complex number");
		/*secondRealValue stores real value of second complex number*/
		double secondRealValue = scanner.nextDouble();
		System.out.println("Enter imaginary value of second complex number");
		/*secondImaginaryValue stores real value of second complex number*/
		double secondImaginaryValue = scanner.nextDouble();
		Complex complexNumber1 = new Complex(firstRealValue, firstImaginaryValue);
		Complex complexNumber2 = new Complex(secondRealValue, secondImaginaryValue);
		Complex complexTemporary = addition(complexNumber1, complexNumber2);
		System.out.println("Addition is: " + complexTemporary._real + "+" + complexTemporary._imaginary + "i");
		Complex complexTemporary1 = subtraction(complexNumber1, complexNumber2);
		System.out.println("Subtraction is: " + complexTemporary1._real + "+" + complexTemporary1._imaginary + "i");
	    Complex complexNumber3 = complexNumber1.addition(complexNumber2);
	    System.out.println("Addition is: " + complexNumber3._real + "+" + complexNumber3._imaginary + "i");
	    Complex complexNumber4 = complexNumber1.subtraction(complexNumber2);
	    System.out.println("Subtraction is: " + complexNumber4._real + "+" + complexNumber4._imaginary + "i");
	}
}
