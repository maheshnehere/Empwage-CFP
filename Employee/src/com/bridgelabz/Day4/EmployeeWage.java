package com.bridgelabz.Day4;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int FullTimeHrs = 8,partTimeHrs = 4,wagePerHour = 20;
        int workingDaysInMonth = 20,wageForMonth, wageForMonthPartTime;

        int FullTimeHrs = 8;
        int partTimeHrs = 4;
        int wagePerHour = 20;
        int fullTimeWage, partTimeWage;

        wageForMonth = FullTimeHrs * wagePerHour * workingDaysInMonth;

        wageForMonthPartTime = partTimeHrs * wagePerHour * workingDaysInMonth;

        Random random = new Random() ;
        int num = random.nextInt(3);

        switch (num){
            case(0) :
                System.out.println("Full time Employee Wage for Month is = " + wageForMonth);
                break;
            case(2) :
                System.out.println("Part time Employee Wage for Month is = " + wageForMonthPartTime);
                break;
            default:
                System.out.println("Employee is Absent");
        }
    }
}