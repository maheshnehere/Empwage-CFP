package com.bridgelabz.Day4;

import java.util.ArrayList;
import java.util.List;

class EmpWageBuilder {
    private List<CompanyEmpWage> companyEmpWages;

    public EmpWageBuilder() {
        this.companyEmpWages = new ArrayList<>();
    }

    public void addCompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHrsInMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, empRatePerHour, numWorkingDays, maxHrsInMonth);
        companyEmpWages.add(companyEmpWage);
    }

    public void computeEmpWage() {
        for (CompanyEmpWage companyEmpWage : companyEmpWages) {
            int totalEmpWage = computeEmployeeWage(companyEmpWage);
            companyEmpWage.setTotalEmpWage(totalEmpWage);
            System.out.println("Total Employee Wage for " + companyEmpWage.getCompanyName() + ": $" + totalEmpWage);
            System.out.println("Daily Wages for " + companyEmpWage.getCompanyName() + ": " + companyEmpWage.getDailyWages());
        }
    }
    public int getTotalWageByCompany(String companyName) {
        return companyTotalWages.getOrDefault(companyName, 0);
    }

    private int computeEmployeeWage(CompanyEmpWage companyEmpWage) {
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= companyEmpWage.getMaxHrsInMonth() && totalWorkingDays < companyEmpWage.getNumWorkingDays()) {
            int empHrs = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case 1:
                    empHrs = 8;
                    break;
                case 2:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }

            int dailyWage = empHrs * companyEmpWage.getEmpRatePerHour();
            companyEmpWage.addDailyWage(dailyWage);

            totalEmpHrs += empHrs;
            totalWorkingDays++;
        }

        return totalEmpHrs * companyEmpWage.getEmpRatePerHour();
    }
}



