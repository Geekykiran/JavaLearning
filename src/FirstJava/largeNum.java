package FirstJava;
//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class largeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a and b values");
        int a = in.nextInt();
        int b = in.nextInt();
        if(a>b) System.out.println("A is the largest number");
        else System.out.println("B is the largest number");
    }
}
