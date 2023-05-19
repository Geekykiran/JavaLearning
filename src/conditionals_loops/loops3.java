package conditionals_loops;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class loops3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Enter any number\nEnter 0 to sum all the numbers: ");
            int number = sc.nextInt();
            if(number == 0) break;
            sum += number;
        }
        System.out.println("Sum of the values you entered: "+sum);
    }
}
