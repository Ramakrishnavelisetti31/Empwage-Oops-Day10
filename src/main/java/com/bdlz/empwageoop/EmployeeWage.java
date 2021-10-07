package com.bdlz.empwageoop;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;
    public static void main(String[] args) {
        int empHrs, empWage;
        int day = 1;
        int totalHours = 0;
        int totalWage = 0;
        while (day <= MAX_WORKING_DAYS && totalHours <= MAX_WORKING_HOURS) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    System.out.println("day " + day);
                    empHrs = 8;
                    System.out.println("Employee present for Full Time");
                    break;
                case IS_PART_TIME:
                    System.out.println("day " + day);
                    empHrs = 4;
                    System.out.println("Employee present for Part Time");
                    break;
                default:
                    System.out.println("day " + day);
                    empHrs = 0;
                    System.out.println("Employee is absent");
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalHours = totalHours + empHrs;
            totalWage = totalWage + empWage;
            System.out.println("Emp Wage: " + empWage);
            day++;
        }
        System.out.println("");
        System.out.println("Total Working Hours in Month is " + totalHours);
        System.out.println("Total EmployeeWage Per Month is " + totalWage);
    }
}
