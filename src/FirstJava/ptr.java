package FirstJava;

import java.util.Scanner;

public class ptr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total amount");
        long p = in.nextLong();
        System.out.println("How many months?");
        int t = in.nextInt();
        long r = 2;
        long interest = (p/100)*r*t;
        System.out.println("Total interest for the amount: "+interest);
    }
}
