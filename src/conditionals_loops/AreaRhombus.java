package conditionals_loops;

import java.util.Scanner;

//Area Of Rhombus
public class AreaRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float d1,d2, area;
        System.out.println("Enter the length of the Rhombus");
        d1 = sc.nextFloat();
        System.out.println("Enter the width of the Rhombus");
        d2 = sc.nextFloat();
        area = (d1*d2)/2;
        System.out.println("Area of a Rhombus is: "+area);
    }
}
