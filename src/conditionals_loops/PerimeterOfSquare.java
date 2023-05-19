package conditionals_loops;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        int s = sc.nextInt();
        double p = 4 * s;
        System.out.println("Perimeter of square is: " + p);
    }
}
