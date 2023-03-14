package week6homework;

import java.util.Scanner;

/**
 * 17. Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */

public class Programme17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.MAX_VALUE;
        while (number != 0) {// Ask user to enter number for decimal to binary conversion
             System.out.println("\nEnter a decimal number to convert into binary format");
            number = scanner.nextInt();
            // one way to convert decimal number to binary in Java
            byte[] bits = toBinary(number);
            printBinary(bits);
            // combined conversion and printing part in one method
            //convert(number);
        }
        scanner.close();
    }

    public static byte[] toBinary(int number) {
        byte[] binary = new byte[32];
        int index = 0;
        int copyOfInput = number;
        while (copyOfInput > 0) {
            binary[index++] = (byte) (copyOfInput % 2);
            copyOfInput = copyOfInput / 2;
        }
        return binary;
    }
    public static void printBinary(byte[] binary)
    { for (int i = binary.length - 1; i >= 0; i--) {
        System.out.print(binary[i]); } }





}

