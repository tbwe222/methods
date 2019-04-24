package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        sum();
        quotient();
        average();
        area();
        oddOrEven();
        grade();
        leapYear();
        length();
    }
//    Add two numbers given by the user
    public static void sum(){
        System.out.println("Sum calculator \n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter a number: ");
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);
    }
// Write an application to divide 2 numbers. Prompt the user to enter two numbers.
// Take the first number and divide it by the second number and print that result to the screen.
// If the second number is a zero, print "Undefined" to the screen, otherwise just print the result.
    public static void quotient(){
        System.out.println("\n Quotient finder\n ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter a number: ");
        double num2 = scan.nextDouble();
            if (num2==0){
                System.out.println("undefined");
            }else {
                System.out.println("The quotient of the two numbers is: " + num1 / num2);
            }
    }
//    Get the length of a string.
public static void length(){
    System.out.println("\n length of word\n ");
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a word: ");
    String str = scan.nextLine();
    System.out.println("the length of the word is: " + str.length());

}
//    Get the average of 3 numbers.
    public static void average(){
        System.out.println("\n Find the average \n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter a number: ");
        double num2 = scan.nextDouble();
        System.out.println("Enter a number: ");
        double num3 = scan.nextDouble();
        double average = ((num1+num2+num3)/3);
        System.out.println("The average of the three numbers is: " + average);
    }

//    Calculate the area of a rectangle with length and width input from the user.
    public static void area(){
        System.out.println("\n Calculate Area \n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = scan.nextDouble();
        System.out.println("Enter width: ");
        double width = scan.nextDouble();

        System.out.println("The area is: " + width * length);
    }
//    Take integer input from the user, output whether it's odd or even.
    public static void oddOrEven(){
        System.out.println("\n Odd or Even \n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if (num == 1){
            System.out.println("odd");
        }else if(num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
//    Write a program that will print the letter grade based on the percentage entered.
    public static void grade(){
        System.out.println("\nYour letter Grade \n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a percentage(0-100): ");
        int percentage = scan.nextInt();
            if (percentage >= 90){
                System.out.println("A");
            }else if (percentage >= 80){
                System.out.println("B");
            }else if (percentage >= 70){
                System.out.println("C");
            }else if (percentage >= 60){
                System.out.println("D");
            }else{
                System.out.println("F");
            }
    }
//    Check if a year is a leap year
public static void leapYear() {
    System.out.println("\nLeap year or not \n");
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int leapYear = scan.nextInt();
    if (leapYear % 4 == 0) {
        System.out.println("leap year ");
    } else {
        System.out.println("not leap year ");
    }
}
}
