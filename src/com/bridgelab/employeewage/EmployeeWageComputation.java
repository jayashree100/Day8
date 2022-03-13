package com.bridgelab.employeewage;

import java.util.Random;

public class EmployeeWageComputation {
	static final int EMP_WAGE_PER_HOUR = 20;
	static final int IS_PART_TIME = 1;
	static final int IS_FULL_TIME = 2;
	static int noOfWorkingDays = 20;
	static int hourInMonth = 100;
	static int fullDayHr = 8;
	static int partTimeHr = 4;
	static int day = 0;

	public static int attendanceCheck() {
		Random rand = new Random();
		int random = rand.nextInt(2);
		System.out.println("===============================");
		System.out.println("Employee Attendance checking");

		if (random == 1)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");

		return random;
	}

	public static int getDailyWage() {

		int Daily_wage = EMP_WAGE_PER_HOUR * fullDayHr;
		return Daily_wage;
	}

	public static int getPartTimeWage() { // adding part time wager
		int PartTimeWage = EMP_WAGE_PER_HOUR * partTimeHr;
		return PartTimeWage;
	}

	public static void useSwitch() {
		System.out.println("***********************************************************************");
		System.out.println("Use Case 4");

		int empWages = 0;
		int empHour = 0;
		int EmployeCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (EmployeCheck) {
		case IS_FULL_TIME:
			empHour = 8;
			break;
		case IS_PART_TIME:
			empHour = 4;
			break;
		default:
			empHour = 0;
		}
		empWages = empHour * EMP_WAGE_PER_HOUR;
		System.out.println("Employewage: " + empWages);
	}

	public static void empWageForMonth() {
		System.out.println("***********************************************************************");
		System.out.println("Use Case 5");
		int empWages = 0;
		int empHour = 0;
		int TotalEmployeWage = 0;
		for (int day = 0; day < noOfWorkingDays; day++) {
			int EmployeCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (EmployeCheck) {
			case IS_FULL_TIME:
				empHour = 8;
				break;
			case IS_PART_TIME:
				empHour = 4;
				break;
			default:
				empHour = 0;
			}
			empWages = empHour * EMP_WAGE_PER_HOUR;
			System.out.println("Employewage: " + empWages);
		}
		System.out.println("TotalEmployewage: " + TotalEmployeWage);
	}

	public static void totalWorkingHourCondition() {
		System.out.println("***********************************************************************");
		System.out.println("Use Case 6");
		int empWages = 0;
		int totalEmployeHour = 0;
		int totalEmployeWage = 0;
		int totalWorkingDays = 0;
		while (totalWorkingDays < noOfWorkingDays && totalEmployeHour <= hourInMonth) {
			int empHour = 0;
			totalWorkingDays++;
			int EmployeCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (EmployeCheck) {
			case IS_FULL_TIME:
				empHour = 8;
				break;
			case IS_PART_TIME:
				empHour = 4;
				break;
			default:
				empHour = 0;
			}
			totalEmployeHour += empHour;
			empWages = empHour * EMP_WAGE_PER_HOUR;
			totalEmployeWage += empWages;
			System.out.println("Employewage: " + empWages);
		}
		System.out.println("TotalEmployewage: " + totalEmployeWage);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

		int attendance = attendanceCheck();
		System.out.println(attendance);
		int dailyWage = getDailyWage();
		// System.out.println("This is Full Time Employee Wage :" + dailyWage);
		int partTimeWage = getPartTimeWage();
		// System.out.println("This is part time Employee wage:" + partTimeWage);
		useSwitch();
		empWageForMonth();
		totalWorkingHourCondition();

	}

}
