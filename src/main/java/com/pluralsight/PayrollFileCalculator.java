package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PayrollFileCalculator {
    public static void main(String[] args) {


        try {
            BufferedReader reader = new BufferedReader(new FileReader("employess.csv"));
            reader.readLine();
            String csvLine;

            while((csvLine = reader.readLine()) != null) {
            String[] tokens = csvLine.split("\\|");


            int employeeId = Integer.parseInt(tokens[0]);
            String name = tokens[1];
            double hoursWorked = Double.parseDouble(tokens[2]);
            double payRate = Double.parseDouble(tokens[3]);

            Employee employeeProfile = new Employee(employeeId, name, hoursWorked, payRate);


            }

        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
