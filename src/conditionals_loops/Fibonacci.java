package conditionals_loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextByte();
        System.out.println("Fibonacci series upto "+num);
        System.out.print("0, 1");
        int fT = 0, sT = 1;
        int i=0;
        while (i<=num) {
            int nT;
            nT = fT + sT;
            fT = sT;
            sT = nT;
            System.out.print(", "+nT);
            i++;
        }
    }
}
