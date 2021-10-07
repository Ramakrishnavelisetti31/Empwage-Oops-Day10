package com.bdlz.empwageoop;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static int empWage(String company, int empRatePerHr, int maxWorkDays, int maxWorkHrs) {
        int empHrs, empWage;
        int day = 1;
        int totalHours = 0;
        int totalWage = 0;
        while (day <= maxWorkDays && totalHours <= maxWorkHrs) {
            day++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * empRatePerHr;
            totalWage = totalWage + empWage;
            System.out.println("The Emp Wage for employee is " + empWage);
        }
        System.out.println("The emp wage for employee in the " + company + " is " + totalWage);
        return totalWage;
    }
    public static void main(String[] args) {
        empWage("Cognizant", 15,18,100);
        empWage("Accenture", 20,20,90);
    }
}
