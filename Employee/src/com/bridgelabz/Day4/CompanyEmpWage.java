package com.bridgelabz.Day4;

import java.util.ArrayList;
import java.util.List;

class CompanyEmpWage {
    private final String companyName;
    private final int empRatePerHour;
    private final int numWorkingDays;
    private final int maxHrsInMonth;
    private List<Integer> dailyWages;
    private int totalEmpWage;

    public CompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHrsInMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numWorkingDays = numWorkingDays;
        this.maxHrsInMonth = maxHrsInMonth;
        this.dailyWages = new ArrayList<>();
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

    public List<Integer> getDailyWages() {
        return dailyWages;
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public void addDailyWage(int dailyWage) {
        dailyWages.add(dailyWage);
    }
}

