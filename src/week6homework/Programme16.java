package week6homework;

import java.util.Scanner;

/**
 * 16. Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */

public class Programme16 {
    public static void main(String[] args){

        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter first binary number");
        String first = scnr.nextLine();
        System.out.println("Please enter second binary number");
        String second = scnr.nextLine();
        String addition = add(first, second);
        System.out.println("addition of two binary number is : " + addition);
        scnr.close(); }

    public static String add(String first, String second){
     int b1 = Integer.parseInt(first, 2);
     int b2 = Integer.parseInt(second, 2);
     int sum = b1 + b2;
     return Integer.toBinaryString(sum); }

    }


