package week6homework;

import java.util.Scanner;

/* * . Write a Java program to convert a given string into lowercase.
* Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
* Output: the quick brown fox jumps over the lazy dog.
*/
public class Programme19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sample Input:");
        String line = scanner.nextLine();
        String lower = line.toLowerCase();
        System.out.println("Output: " + lower);
        scanner.close();
    }
}