package com.bridgelab.employeewage;

import java.util.Random;

public class EmployeeWageComputation {
	static final int EMP_WAGE_PER_HOUR = 20;
	

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		Random rand = new Random();
		int random = rand.nextInt(2);
		System.out.println(random);

		if (random == 1) {
			System.out.println("Employee is Present");
			int empHr = 8;
			int empWage = EMP_WAGE_PER_HOUR * empHr;
		}
		    
		else
			System.out.println("Employee is Absent");
	}

}
