package conditionals_loops;

import java.util.Scanner;
//Perimeter Of Rectangle
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter the width of the Rectangle: ");
        int w = sc.nextInt();
        if(l>w) {
            double p = 2 * (l + w);
            System.out.println("Perimeter of Rectangle is: " + p);
        }
        else System.out.println("length should be greater than width");


    }
}
