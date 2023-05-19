package conditionals_loops;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class loops4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largeNum = 0;
        while (true){
            System.out.println("Enter any number\nEnter 0 to sum get the largest number: ");
            int num = sc.nextInt();
            if(num == 0) break;
            if( num > largeNum) largeNum = num;
        }
        System.out.println("largest number: "+largeNum);
    }
}
