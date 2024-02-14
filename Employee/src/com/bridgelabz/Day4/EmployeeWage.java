package com.bridgelabz.Day4;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int fullDayHours = 8, wagePerHour = 20,dailyWage = 0;

        dailyWage = fullDayHours * wagePerHour;

        Random random = new Random();
        boolean num = random.nextBoolean();

        if (num) { // Employee is present.
            System.out.println("Daily Employee wage is = " + dailyWage);
        } else { // Employee is absent.
            System.out.println("Daily Employee wage is = 0");
        }
    }
}