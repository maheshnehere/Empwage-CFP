package com.bridgelabz.Day4;

class CompanyEmpWage {
    private final String companyName;
    private final int empRatePerHour;
    private final int numWorkingDays;
    private final int maxHrsInMonth;
    private int totalEmpWage;

    public CompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHrsInMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numWorkingDays = numWorkingDays;
        this.maxHrsInMonth = maxHrsInMonth;
        this.totalEmpWage = 0;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getEmpRatePerHour() {
        return empRatePerHour;
    }

    public int getNumWorkingDays() {
        return numWorkingDays;
    }

    public int getMaxHrsInMonth() {
        return maxHrsInMonth;
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }
}

