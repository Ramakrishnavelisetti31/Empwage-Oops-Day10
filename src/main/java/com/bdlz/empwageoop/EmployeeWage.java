package com.bdlz.empwageoop;

public class EmployeeWage {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("employee is Present");
        } else {
            System.out.println("employee is Absent");
        }    }
}
