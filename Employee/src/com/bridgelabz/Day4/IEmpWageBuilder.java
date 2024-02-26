package com.bridgelabz.Day4;

public interface IEmpWageBuilder {
    void addCompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHrsInMonth);
    void computeEmpWage();
}
