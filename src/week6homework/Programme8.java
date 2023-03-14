package week6homework;

import java.util.Scanner;

/* *  Write a program to calculate the area of a triangle.
*/
public class Programme8 {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);//
        System.out.println("Enter the width of the triangle: ");
        int w = scanner.nextInt();// create scanner to get area of triangle from user
        System.out.println("Enter the height of the triangle: ");
        float h = scanner.nextFloat();
        double area = (w * h) / 2;
        System.out.println("Area of triangle is : " + area);// get user input
        scanner.close();
    }
}