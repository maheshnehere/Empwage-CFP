package com.bridgelabz.Day4;


    public class EmployeeWageMain {
            public static void main(String[] args) {
                // Creating an instance of EmpWageBuilder
                EmpWageBuilder empWageBuilder = new EmpWageBuilder();

                // Adding companies and their respective parameters
                empWageBuilder.addCompanyEmpWage("Company A", 20, 22, 100);
                empWageBuilder.addCompanyEmpWage("Company B", 25, 25, 120);

                String companyNameToQuery = "Company A";
                int totalWageByCompany = empWageBuilder.getTotalWageByCompany(companyNameToQuery);
                System.out.println("Total Wage for " + companyNameToQuery + ": $" + totalWageByCompany);

                // Computing employee wage for each company
                empWageBuilder.computeEmpWage();
            }
        }
