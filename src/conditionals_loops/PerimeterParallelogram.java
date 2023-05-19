package conditionals_loops;

import java.util.Scanner;
//Perimeter Of Parallelogram

public class PerimeterParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the Parallelogram: ");
        int s = sc.nextInt();
        System.out.println("Enter the base of the Parallelogram: ");
        int b = sc.nextInt();
        double p = 2*(s+b);
        System.out.println("Perimeter of Parallelogram is: "+p);
    }
}