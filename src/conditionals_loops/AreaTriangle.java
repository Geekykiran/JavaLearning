package conditionals_loops;
//Area Of Triangle

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float b,h, area;
        System.out.println("Enter the base of the Triangle: ");
        b = sc.nextInt();
        System.out.println("Enter the height of the Triangle: ");
        h = sc.nextInt();
        area = (float)1/2*b*h;
        System.out.println("area of Triangle is: "+area);
    }
}
