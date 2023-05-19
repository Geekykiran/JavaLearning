package conditionals_loops;

import java.util.Scanner;

public class AdditionTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition of two numbers: "+Add(a,b));
    }
    static int Add(int a, int b)
    {
        return a+b;
    }
}
