package conditionals_loops;

import java.util.Scanner;

public class TotalSurfaceAreaCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        double s = sc.nextInt();
        double area = 6 * (s*s);
        System.out.println("Area of cube is: " + area);
    }
}
