package com.bridgelabz.Day4;

import java.util.Random;

public class EmployeeWage {
    // Class method to compute employee wage for a specific company
    public static int computeEmployeeWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHrsInMonth) {
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

        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Employee Wage for " + companyName + ": $" + totalEmpWage);
        return totalEmpWage;
    }
}

public class EmployeeWageMain {
    public static void main(String[] args) {
        // Calling the class method to compute employee wage for multiple companies
        EmployeeWage.computeEmployeeWage("Company A", 20, 22, 100);
        EmployeeWage.computeEmployeeWage("Company B", 25, 25, 120);
    }
}