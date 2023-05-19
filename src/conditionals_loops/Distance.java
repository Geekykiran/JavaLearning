package conditionals_loops;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start point: ");
        int start = sc.nextInt();
        System.out.println("Enter the end point: ");
        int end = sc.nextInt();
        if(start < 0 || end < start){
            System.out.println("negative points are invalid: ");
        }
        else {
            int distance = end - start;
            System.out.println("Distance between the two points are: " + distance);
        }

    }
}
