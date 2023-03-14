package week6homework;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */

public class Programme10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;
        int h = 8;
        int i = 9;
        int j = 10;
        int z = scanner.nextInt();
         System.out.println( z+ " x " +a + " = " + (z*a) );
         System.out.println( z+ " x " +b + " = " + (z*b) );
         System.out.println( z+ " x " +c + " = " + (z*c) );
         System.out.println( z+ " x " +d + " = " + (z*d) );
         System.out.println( z+ " x " +e + " = " + (z*e) );
         System.out.println( z+ " x " +f + " = " + (z*f) );
         System.out.println( z+ " x " +g + " = " + (z*g) );
         System.out.println( z+ " x " +h + " = " + (z*h) );
         System.out.println( z+ " x " +i+ " = "  + (z*i) );
         System.out.println( z+ " x " +j + " = " + (z*j) );
         scanner.close();
    }

}
