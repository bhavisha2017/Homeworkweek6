package week6homework;
/* * Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
*/


import java.util.Scanner;

public class Programme6 {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);// create scanner to get radius from user
        System.out.print("Enter radius of circle to calculate area:");// get user input
        int r = scanner.nextInt();//radius of the area = 10
        double area = Math.PI * r * r;// PI= 3.14;
        System.out.println("Area of " + r + "radius of circle is :" + area);//print the result
        scanner.close();
    }

}