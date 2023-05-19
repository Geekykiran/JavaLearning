package conditionals_loops;

import java.util.Scanner;

//Volume Of Cone
public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Rectangle: ");
        double r = sc.nextInt();
        System.out.println("Enter the height of the Rectangle: ");
        double h = sc.nextInt();
        double pi = 3.14;
        double v= pi*(r*r)*((double) h /3);
        System.out.println("Volume Of Cone is: "+v);
    }
}
