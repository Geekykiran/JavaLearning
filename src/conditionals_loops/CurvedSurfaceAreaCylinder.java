package conditionals_loops;

import java.util.Scanner;

//Curved Surface Area Of Cylinder
//2πr × h = 2πrh
public class CurvedSurfaceAreaCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Rectangle: ");
        double r = sc.nextInt();
        System.out.println("Enter the height of the Rectangle: ");
        double h = sc.nextInt();
        double pi = 3.14;
        double area= (2*pi*r)*h;
        System.out.println("Area Of Cone is: "+area);
    }
}
