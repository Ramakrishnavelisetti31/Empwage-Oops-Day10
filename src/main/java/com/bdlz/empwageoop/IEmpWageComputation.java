package com.bdlz.empwageoop;

public interface IEmpWageComputation {
    public void addCompanyInfo(String companyName, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth);
    public void computeEmpWage();

}
