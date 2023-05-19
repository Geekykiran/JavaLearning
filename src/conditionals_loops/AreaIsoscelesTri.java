package conditionals_loops;

import java.util.Scanner;

//Area Of Isosceles Triangle
public class AreaIsoscelesTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hb,b, area;
        System.out.println("Enter the height base of the triangle");
        hb = sc.nextFloat();
        System.out.println("Enter the base of the triangle");
        b = sc.nextFloat();
        if(hb>b){
            area = (hb*b)/2;
            System.out.println("Area of a Isosceles Triangle is: "+area);
        }
        else System.out.println("Length should be greater than width");
    }
}
