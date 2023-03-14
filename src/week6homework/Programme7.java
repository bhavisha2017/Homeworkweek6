package week6homework;
/* *Write a program to insert any temperature value in degree Fahrenheit and
        convert to degree Celsius ((F − 32) × 5/9 = 0°C
*/

import java.util.Scanner;

public class Programme7 {//Fahrenheit to celsius


    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);// create scanner to get temperature from user
        System.out.print("Enter Fahrenheit temperature: ");// get user input
        int f = scanner.nextInt();//temperature in fahrenheit = 68
        float t = ((f - 32) * 5)/9;// fahrenheit to celsius
        System.out.print("The temperature in celsius is: "+ t +" °C");// get user input
        scanner.close();

    }

}
