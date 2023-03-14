package week6homework;
import java.util.Scanner;
/**
 * 15. Write a Java program to swap two variables.
 */
public class Programme15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input num1: ");
        int a = scanner.nextInt();
        System.out.println("input num2: ");
        int b = scanner.nextInt();
        System.out.println("Before Swapping = " + a + "; " + b);
        int ab;
        ab = a;
        a = b;
        b = ab;
        System.out.println("after Swapping = " + a + "; " + b);
        scanner.close();
    }
}

