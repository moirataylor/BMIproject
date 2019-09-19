package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner Keyboard;
       String whatsYourName;
       float height,weight;
       float CONVERSION_IN_METERS = 0.0254f;
       float COVERSION_IN_KILOGRAMS = 0.453592f;
       float BMI;



        Keyboard = new Scanner(System.in);

        System.out.println("Hello!");
        System.out.println("Today we're going to be finding your BMI.");
        System.out.println("what's your name?");
        whatsYourName = Keyboard.nextLine();
        System.out.print("alright! first question, how tall are you in inches?");
        height = Keyboard.nextFloat();
        System.out.println("how much do you weigh?");
        weight = Keyboard.nextFloat();


        height = height * CONVERSION_IN_METERS;
        weight = weight * COVERSION_IN_KILOGRAMS;

       





























    }
}
