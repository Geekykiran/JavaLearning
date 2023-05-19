package FirstJava;
//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        if(num%2 == 0) {
            System.out.println("Entered number is Even");
        }
        else {
            System.out.println("Entered number is Odd");
        }
    }
}
