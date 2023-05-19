package FirstJava;
//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        System.out.println("Enter Your Name:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello, "+name);
    }
}
