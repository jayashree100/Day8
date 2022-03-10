package com.bridgelab.employeewage;

import java.util.Random;

public class EmployeeWageComputation {
	static final Integer EMP_WAGE_PER_HOUR = 20;
	

	public static int attendanceCheck() {
		Random rand = new Random();
		int random = rand.nextInt(2);
		System.out.println(random);

		if (random == 1) {
			System.out.println("Employee is Present");
			Integer empHr = 8;
			Integer empWage = EMP_WAGE_PER_HOUR * empHr;
		}
		    
		else
			System.out.println("Employee is Absent");

		return random;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		 attendanceCheck();
		
	}

}
