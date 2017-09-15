package com.theironyard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number");
        String num1 = scanner.nextLine();


        System.out.println("Enter a number");
        String num2 = scanner.nextLine();


        double operand1 = Double.parseDouble(num1);
        double operand2 = Double.parseDouble(num2);

        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double division = operand1 / operand2;
        double multiplication = operand1 * operand2;
        double remainder = operand1 % operand2;

        showResults(sum, difference, division, multiplication, remainder);
    }

    private static void showResults(double sum, double difference, double division, double multiplication, double remainder) {
        System.out.println("the sum is " + sum);
        System.out.println("the difference is " + difference);
        System.out.println("the division is " + division);
        System.out.println("the multiplication is " + multiplication);
        System.out.println("the remainder is " + remainder);
    }


}
