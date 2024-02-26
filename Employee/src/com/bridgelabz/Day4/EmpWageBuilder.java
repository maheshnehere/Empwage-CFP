package com.bridgelabz.Day4;
class EmpWageBuilder {
    private int numCompanies;
    private CompanyEmpWage[] companyEmpWages;

    public EmpWageBuilder() {
        this.numCompanies = 0;
        this.companyEmpWages = new CompanyEmpWage[5]; // Assuming a maximum of 5 companies for this example
    }

    public void addCompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHrsInMonth) {
        companyEmpWages[numCompanies] = new CompanyEmpWage(companyName, empRatePerHour, numWorkingDays, maxHrsInMonth);
        numCompanies++;
    }

    public void computeEmpWage() {
        for (int i = 0; i < numCompanies; i++) {
            int totalEmpWage = computeEmployeeWage(companyEmpWages[i]);
            companyEmpWages[i].setTotalEmpWage(totalEmpWage);
            System.out.println("Total Employee Wage for " + companyEmpWages[i].getCompanyName() + ": $" + totalEmpWage);
        }
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

            totalEmpHrs += empHrs;
            totalWorkingDays++;
        }

        return totalEmpHrs * companyEmpWage.getEmpRatePerHour();
    }
}

