package conditionals_loops;

import java.util.Scanner;

//Area Of Rectangle Program
public class AreaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float l,h, area;
        System.out.println("Enter the length of the triangle");
        l = sc.nextFloat();
        System.out.println("Enter the width of the triangle");
        h = sc.nextFloat();
        if(l>h){
            area = l*h;
            System.out.println("Area of a Triangle is: "+area);
        }
        else System.out.println("Length should be greater than width");
    }
}
