package com.bridgelabz.Day4;

class EmpWageBuilder implements IEmpWageBuilder {
    private int numCompanies;
    private CompanyEmpWage[] companyEmpWages;

    public EmpWageBuilder() {
        this.numCompanies = 0;
        this.companyEmpWages = new CompanyEmpWage[5]; // Assuming a maximum of 5 companies for this example
    }

    @Override
    public void addCompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHrsInMonth) {
        companyEmpWages[numCompanies] = new CompanyEmpWage(companyName, empRatePerHour, numWorkingDays, maxHrsInMonth);
        numCompanies++;
    }

    @Override
    public void computeEmpWage() {
        for (int i = 0; i < numCompanies; i++) {
            int totalEmpWage = computeEmployeeWage(companyEmpWages[i]);
            companyEmpWages[i].setTotalEmpWage(totalEmpWage);
            System.out.println("Total Employee Wage for " + companyEmpWages[i].getCompanyName() + ": $" + totalEmpWage);
        }
    }

    private int computeEmployeeWage(CompanyEmpWage companyEmpWage){

    }
        // (Same as previous code...)

}



