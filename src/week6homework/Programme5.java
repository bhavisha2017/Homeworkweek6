package week6homework;
/* *Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.
*/


import java.util.Scanner;

public class Programme5 {


    public static void addition(String[] args) {// addition with  static method


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = sc.nextInt();
        System.out.println("Enter second number");
        double b = sc.nextInt();
        System.out.println("Addition of two numbers is : " + (a + b));

        sc.close();
    }

    public static void subtraction(String[] args) {// subtraction with static method


        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = s.nextInt();
        System.out.println("Enter second number");
        int b = s.nextInt();
        System.out.println("Subtraction of two numbers is : " + (a + b));
        s.close();
    }

    public void multiplication(String[] args) {// multiplication with instance method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int y = sc.nextInt();
        System.out.println("Multiplication of two numbers is : " + (x * y));
        sc.close();
    }

    public void division(String[] arg) {// division with instance method



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator value");
        int n = sc.nextInt();
        System.out.println("Enter denominator value");
        int d = sc.nextInt();


        System.out.println("Division of two numbers is : " + (n/d));

        //but
        System.out.println("denominator value should not be 0");
        sc.close();

    }
}



