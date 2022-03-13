package com.bridgelab.employeewage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class EmployeeWageComputation implements IEmployeeWageComputation{

	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;

	ArrayList<CompanyEmpWage> companies;

	HashMap<String, Integer> totalEmpWages;

	public EmployeeWageComputation() {
		companies = new ArrayList<>();
		totalEmpWages = new HashMap<>();
	}

	public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
		CompanyEmpWage company = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
		companies.add(company);
		totalEmpWages.put(companyName, 0);
	}

	int generateEmployeeType() {
		return (int) (Math.random() * 100) % 3;
	}

	int getWorkingHrs(int empType) {
		switch (empType) {
		case FULL_TIME:
			return 8;
		case PART_TIME:
			return 4;
		default:
			return 0;
		}
	}

		
	public static void main(String args[]) {
		EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();
        employeeWageComputation.addCompany("Microsoft", 4, 30, 100);
        employeeWageComputation.addCompany("Google", 5, 40, 170);
        employeeWageComputation.addCompany("Amazon", 19, 10, 150);
        

	}
}
