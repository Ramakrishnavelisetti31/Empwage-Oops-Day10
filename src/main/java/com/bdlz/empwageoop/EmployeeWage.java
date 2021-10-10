package com.bdlz.empwageoop;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private int numOfCompany = 0;
    private CompanyInfo[] companyInfoArray;

    public EmployeeWage() {
        companyInfoArray = new CompanyInfo[2];
    }

    private void addCompanyInfo(String companyName, int empRatePerHr, int maxWorkDays, int maxWorkHrs) {
        companyInfoArray[numOfCompany] = new CompanyInfo(companyName, empRatePerHr, maxWorkDays, maxWorkHrs);
        numOfCompany++;
    }
    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyInfoArray[i].setTotalWage(this.computeEmpWage(companyInfoArray[i]));
            System.out.println(companyInfoArray[i]);
        }
    }

    public int empWage(CompanyInfo companyInfo) {
        int empHrs, empWage;
        int day = 1;
        int totalHours = 0;
        int totalWage = 0;
        while (day <= companyInfo.getMaxWorkDays() && totalHours <= companyInfo.getMaxWorkHrs()) {
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
            empWage = empHrs * companyInfo.getEmpRatePerHr();
            totalWage = totalWage + empWage;
            System.out.println("The Emp Wage for employee is " + empWage);
        }
        System.out.println("The emp wage for employee in the " + companyInfo.getCompanyName() + " is " + totalWage);
        return totalWage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        EmployeeWage wage = new EmployeeWage();
        wage.addCompanyInfo("TATA", 20, 15, 60);
        wage.addCompanyInfo("DMART", 18, 20, 90);
        wage.computeEmpWage();
    }
}
