package assignments;

import java.util.Scanner;

/**
 * @author Palak Tiwari
 * Implements methods to calculate the volume of the three dimensional
 * object like cylinder,sphere,cube and cuboid
 *
 */
public class ThreeDimObject {
	/*holds constant value of PI i.e. 3.14*/
	public static final double PI =3.1428;

	/**
	 * @param length
	 * Method to calculate the volume of cube
	 */
	public void volume(int length) {
		int cube = length * length * length;
		System.out.println("The volume of cube is: " + cube);
	}

	
	/**
	 * @param length
	 * @param breadth
	 * @param height
	 * Method to calculate the volume of Cuboid 
	 */
	public void volume(int length, int breadth, int height) {
		int cuboid = length * breadth * height;
		System.out.println("The volume of cuboid is: " + cuboid);
	}

	/**
	 * @param radius
	 * Method to calculate the volume of sphere
	 */
	public void volume(double radius) {
		double sphere = (4.0 / 3.0) * (radius * radius * radius);
		System.out.println("The volume of sphere is: " + sphere);
	}

	
	/**
	 * @param radius
	 * @param height
	 * Method to calculate the volume of cylinder 
	 */
	public void volume(double radius, int height) {
		double cylinder = PI * radius * radius * height;
		System.out.println("The volume of cylinder is: " + cylinder);
	}

	boolean isNumberOrNot(String input) {
		try {
			Double.parseDouble(input);
		} catch (NumberFormatException ex) {
			return false;
		}
		return true;
	}

	/**
	 * @param args commanline arguments stores array of objects of string 
	 * Calls method to calculate the volume of three dimension objects
	 */
	public static void main(String[] args) {
     	ThreeDimObject threeDimObject = new ThreeDimObject();
    	boolean value = threeDimObject.isNumberOrNot("+");
		System.out.println("value is: " + value);
		/*stores value to perform the operations */
		int choice;
		/*stores the length of three dimension object*/
		int length;
		/*stores the breadth of three dimension object*/
		int breadth;
		/*stores the height of three dimension object*/
		int height;
		/*stores the radius of three dimension object */
		int radius;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice:");
		System.out.println("1.Volume of Cube");
		System.out.println("2.Volume of Cuboid:");
		System.out.println("3.Volume of Cylinder:");
		System.out.println("4.Volume of Sphere:");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter length: ");
			length = scanner.nextInt();
           /*calls method to calculate the volume of cube*/
			threeDimObject.volume(length);
			break;

		case 2:
			System.out.println("Enter the length ,breadth and height");
			length = scanner.nextInt();
			breadth = scanner.nextInt();
			height = scanner.nextInt();
		  /*calls method to calculate the volume of cuboid*/
			threeDimObject.volume(length, breadth, height);
			break;

		case 3:
			System.out.println("Enter the radius and height");
			radius = scanner.nextInt();
			height = scanner.nextInt();
		  /*calls method to calculate the volume of cylinder*/
			threeDimObject.volume(radius,height);
			break;

		case 4:
			System.out.println("Enter the radius for sphere");
			radius = scanner.nextInt();
	   	/*calls method to calculate the volume of sphere*/
			threeDimObject.volume(radius);
			break;

		default:
			System.out.println("Invalid Input");
			break;

		}
		/*closes the scanner*/
		scanner.close();

	}

}
