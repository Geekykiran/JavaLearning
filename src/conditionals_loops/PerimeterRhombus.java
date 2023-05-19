package conditionals_loops;

import java.util.Scanner;
//Perimeter Of Rhombus
public class PerimeterRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the Rhombus: ");
        int s = sc.nextInt();
        double p = 4 * s;
        System.out.println("Perimeter of Rhombus is: " + p);
    }
}
