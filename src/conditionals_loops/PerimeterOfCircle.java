package conditionals_loops;

import java.util.Scanner;

//Perimeter Of Circle
public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radios of the circle: ");
        int r = sc.nextInt();
        double pi = 3.14, c = 2*pi*r;
        System.out.println("Perimeter of Circle is: "+c);
    }
}
