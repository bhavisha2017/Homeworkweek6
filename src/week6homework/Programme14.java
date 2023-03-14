package week6homework;

import java.util.Scanner;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 *  Expected Output:
 * Area is 5.5 * 8.5 = 46.75
 * Perimeter is 2 * (5.5 + 8.5) = 28.00
 */
public class Programme14 {
    public static void main(String[] strings) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Input Width = ");
        double w = scanner.nextDouble();
        System.out.println( "Input Height = ");
        double H = scanner.nextDouble();
        System.out.println( " Area is = " + w * H);
        System.out.println( " Perimeter is = "  + 2  * (w + H ));
        scanner.close();
    }
}

