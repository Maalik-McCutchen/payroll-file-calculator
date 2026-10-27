package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PayrollFileCalculator {
    public static void main(String[] args) {


        try {
            BufferedReader reader = new BufferedReader(new FileReader("employess.csv"));
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
