package com.bridgelabz.Day4;

import java.util.Random;

public class EmployeeWage {
    // Class variables
    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 2;
    private static final int EMP_RATE_PER_HOUR = 20;
    private static final int NUM_WORKING_DAYS = 20;
    private static final int MAX_HRS_IN_MONTH = 100;

    // Class method to compute employee wage
    public static int computeEmployeeWage() {
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS) {
            int empHrs = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case FULL_TIME:
                    empHrs = 8;
                    break;
                case PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }

            totalEmpHrs += empHrs;
            totalWorkingDays++;
        }

        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        return totalEmpWage;
    }

    public static void main(String[] args) {
        // Calling the class method to compute employee wage
        int totalWage = computeEmployeeWage();
        System.out.println("Total Employee Wage: $" + totalWage);
    }
}