package com.bridgelabz.Day4;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // UC 1 = Check Employee is Present or Absent
        Random random = new Random();
        boolean num = random.nextBoolean();

        if (num == true) {
            System.out.println(" Employee is Present");
        } else {
            System.out.println(" Employee is Absent");
        }
    }
}