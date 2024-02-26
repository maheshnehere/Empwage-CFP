package com.bridgelabz.Day4;


    public class EmployeeWageMain {
        public static void main(String[] args) {
            // Creating instances of EmpWageBuilder for each company
            EmployeeWage companyA = new EmployeeWage("Company A", 20, 22, 100);
            EmployeeWage companyB = new EmployeeWage("Company B", 25, 25, 120);

            // Computing employee wage for each company
            companyA.computeEmployeeWage();
            companyB.computeEmployeeWage();

            // Displaying total employee wage for each company
            companyA.displayTotalEmpWage();
            companyB.displayTotalEmpWage();
        }
}
