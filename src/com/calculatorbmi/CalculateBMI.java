package com.calculatorbmi;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        String weight;
        int growth;

        String[] strings = {
                "Program ten obliczy twoje BMI po podaniu wzrostu oraz wagi.",
                "Podaj swoją aktualną wagę(w kilogramach):",
                "Podaj swój wzrost (w centymterach):",
                "Twoja aktualna waga: ",
                "Twój aktualny wzrost: ",
                "Twoje BMI wynosi: ",
        };

        System.out.println("");
        System.out.println("");
        System.out.println(strings[0]);
        System.out.println("");
        System.out.println("");

        Scanner calculating = new Scanner(System.in);

        System.out.println(strings[1]);
        weight = calculating.nextLine();

        // Enter username and press Enter
        System.out.println(strings[2]);
        growth = calculating.nextInt();

        System.out.println("");
        System.out.println(strings[3] + weight + " kg");

        System.out.println("");
        System.out.println(strings[4] + growth + " cm");

        System.out.println("");

        double growth1 = Double.valueOf(growth) / 100;
        growth1 = Math.pow(growth1,2);
        double resultbmi = Double.valueOf(weight) / growth1;

        System.out.println("");
        System.out.println(strings[5] + String.format("%.2f", resultbmi));

        System.out.println("");

        if (resultbmi < 18.5){
            System.out.println("Według twojego bmi posiadasz niedowagę.");
        }
        else if (resultbmi <= 18.5 || resultbmi <= 24.9){
            System.out.println("Według twojego bmi posiadasz prawidłową wagę.");
        }
        else if (resultbmi <= 25 || resultbmi <= 29.9){
            System.out.println("Według twojego bmi posiadasz nadwagę.");
        }
        else if (resultbmi > 30){
            System.out.println("Według twojego bmi jesteś otyły");
        }

    }
}
