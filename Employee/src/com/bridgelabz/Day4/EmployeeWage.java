package com.bridgelabz.Day4;

import java.util.Random;

public class EmployeeWage {
    // Instance variables for each company
    private final String companyName;
    private final int empRatePerHour;
    private final int numWorkingDays;
    private final int maxHrsInMonth;
    private int totalEmpWage;

    // Constructor to initialize instance variables
    public EmployeeWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHrsInMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numWorkingDays = numWorkingDays;
        this.maxHrsInMonth = maxHrsInMonth;
    }

    // Class method to compute employee wage for the company
    public void computeEmployeeWage() {
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numWorkingDays) {
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

        totalEmpWage = totalEmpHrs * empRatePerHour;
    }

    // Display total employee wage for the company
    public void displayTotalEmpWage() {
        System.out.println("Total Employee Wage for " + companyName + ": $" + totalEmpWage);
    }
}

