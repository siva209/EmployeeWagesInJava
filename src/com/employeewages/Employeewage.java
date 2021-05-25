package com.employeewages;

public class Employeewage {
	
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NUM_OF_WORKING_DAYS = 20;
		
		public static void main(String[] args) {
		int empHrs = 0;
		int empwage = 0;
		int totalEmpWage = 0;
		for (int i = 0; i < NUM_OF_WORKING_DAYS; i++) {
		int attendance = (int) Math.floor(Math.random() * 10) % 3;
		switch (attendance) {
		case 0:
		         System.out.println("Employee is absent");
		         System.out.println();
		         break;
		case 1:
		         System.out.println("Employee is present");
		         System.out.println();
		         empHrs = 8;
		         break;
		case 2:
		         System.out.println("Employee is present for Part time");
		         System.out.println();
		         empHrs = 4;
		         break;
		}
		empwage = EMP_RATE_PER_HOUR * empHrs;
		totalEmpWage = totalEmpWage + empwage;
	  }
	System.out.println("Employee's salary for the day is " + totalEmpWage);
	}
}