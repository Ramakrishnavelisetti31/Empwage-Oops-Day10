package com.bdlz.empwageoop;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private final String company;
    private final int empRatePerHr;
    private final int maxWorkDays;
    private final int maxWorkHrs;
    private int totalWage;

    public EmployeeWage(String company, int empRatePerHr, int maxWorkDays, int maxWorkHrs) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.maxWorkDays = maxWorkDays;
        this.maxWorkHrs = maxWorkHrs;
    }

    public int empWage() {
        int empHrs, empWage;
        int day = 1;
        int totalHours = 0;
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
        EmployeeWage tata = new EmployeeWage("TATA", 20,15,60);
        EmployeeWage dMart = new EmployeeWage("DMART", 18,20,90);
        tata.empWage();
        dMart.empWage();
    }
}
