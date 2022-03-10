package com.bridgelab.employeewage;

import java.util.Random;

public class EmployeeWageComputation {
	static final int EMP_WAGE_PER_HOUR = 20;
	static final int IS_PART_TIME = 1;
	static final int IS_FULL_TIME = 2;
	static int fullDayHr = 8;

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
	
	public static int getDailyWager() {
		
		int Daily_wage = EMP_WAGE_PER_HOUR * fullDayHr; 
		return Daily_wage;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
	}

}
