package conditionals_loops;

import java.util.Scanner;

//Area Of Equilateral Triangle
public class AreaEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the Equilateral Triangle");
        double s = sc.nextDouble();
        double area = (Math.sqrt(3) / 4) * (Math.pow(s, 2));
        System.out.println("Area of a Rhombus is: "+area);
    }
}
