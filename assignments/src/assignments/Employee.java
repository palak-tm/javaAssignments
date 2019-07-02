package assignments;

import java.util.Scanner;

/**
 * @author Palak Tiwari Implements method to get the salary , name and raise
 *         salary of the employee
 */
public class Employee {
	/* name stores the employee name */
	String name;
	/* salary stores the employee salary */
	double salary;

	/**
	 * @param byPercent
	 * Calculate the raiseSalary of the employee by percent
	 */
	public void raiseSalary(double byPercent) {
		double raiseSalary = salary * byPercent / 100;
		salary += raiseSalary;
		System.out.println("Raised salary is: " + salary);
	}

	/**
	 * @param name
	 * @param salary
	 * Assign the value to the name and salary data members
	 */
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	/**
	 * @return Returns the name of employee
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return Returns salary of employee
	 */
	public double getSalary() {
		return salary;
	}
}

/**
 * @author Palak Tiwari Implements method to calculate the salary of the manager
 * and also set or get the bonus of the manager
 *
 */
class Manager extends Employee {
	/* bonus stores the bonus of the manager */
	double bonus;

	/* returns the bonus */
	public double getBonus() {
		return bonus;
	}

	/* set the bonus */
	public void setBonus(double managerBonus) {
		bonus = managerBonus;

	}

	/*
	 * @see assignments.Employee#getSalary() calculates the base salary of manager
	 * by adding salary and bonus
	 */
	@Override
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	/**
	 * @param name
	 * @param salary
	 * to initialize the variables
	 */
	public Manager(String name, double salary) {
		super(name, salary);
		this.bonus = 0;
	}
}

/**
 * @author Palak Tiwari Implements method to get the salary and name of the
 * employee and also calculates salary for manager and raise salary of
 * an employee
 *
 */
class MainClass {
	public static void main(String[] args) {
		/* stores the name of the employee */
		String name;
		/* stores the salary of the employee */
		double salary;
		/* stores the bonus of manager */
		double bonus;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee name");
		name = scanner.nextLine();
		System.out.println("Enter employee salary");
		salary = scanner.nextDouble();
		System.out.println("Enter the bonus");
		bonus = scanner.nextDouble();
		Manager manager = new Manager(name, salary);
		/* set the bonus */
		manager.setBonus(bonus);
		Employee[] employee = new Employee[3];
		employee[0] = new Employee(name, salary);
		for (Employee allEmployee : employee) {
			try {
				/* checks allEmployee is not null */
				if (allEmployee != null) {
					System.out.println("Employee name is: " + allEmployee.getName() + " and salary is: "
					+ allEmployee.getSalary() + " and Manager salary is:" + manager.getSalary());
					System.out.println("Enter the percent to be raised in salary");
					double byPercent = scanner.nextDouble();
					allEmployee.raiseSalary(byPercent);
				}
			} catch (Exception exception) {
				System.out.println("Exception is: " + exception.getMessage());
			}

		}
		/* closes the scanner */
		scanner.close();

	}

}
