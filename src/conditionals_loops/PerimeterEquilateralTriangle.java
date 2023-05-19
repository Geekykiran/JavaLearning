package conditionals_loops;
//Perimeter Of Equilateral Triangle
import java.util.Scanner;

public class PerimeterEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the triangle: ");
        int s = sc.nextInt();
        double p = 3*s;
        System.out.println("Perimeter of triangle is: "+p);
    }
}
