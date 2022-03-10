package com.bridgelab.employeewage;

import java.util.Random;

public class EmployeeWageComputation {

	public static int attendanceCheck() {
		Random rand = new Random();
		int random = rand.nextInt(2);
		System.out.println(random);

		if (random == 1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");

		return random;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		 attendanceCheck();
		
	}

}
