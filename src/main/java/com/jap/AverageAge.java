package com.jap;

import java.util.Scanner;

public class AverageAge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no of employee");
        String[] age = new String[scanner.nextInt()];
        System.out.println("Enter age of employee");

        for (int i = 0; i < age.length; i++) {
            age[i] = String.valueOf(scanner.nextInt());
        }
        AverageAge averageAge = new AverageAge();
        System.out.println(averageAge.averageAgeCalculator(age));

    }

    public String averageAgeCalculator(String[] ageRawData) {
        double average = 0;
        try {
            for (int i = 0; i < ageRawData.length; i++) {
                average = average + Double.parseDouble(ageRawData[i]);
            }
            average = average / ageRawData.length;
        } catch (NumberFormatException e) {
            return e.toString();
        }
        return String.valueOf(average);
    }

}
