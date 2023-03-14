package week6homework;
//Write a program to convert the upper case to lower case

import java.util.Scanner;

public class Programme9 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word in upper case:");
        String a = scanner.nextLine();
        String lowerCase = a.toLowerCase();
        System.out.println("Your answer in lower case: "+ lowerCase);
        scanner.close();


    }

}
