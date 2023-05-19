package conditionals_loops;
import java.util.Scanner;
//Area Of Circle Java Program

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radios of the circle: ");
        int r = sc.nextInt();
        double pi = 3.14, area = pi*(r*r);
        System.out.println("area of Circle is: "+area);
    }
}
