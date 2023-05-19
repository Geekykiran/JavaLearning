package conditionals_loops;

import java.util.Scanner;

//Sum Of N Numbers
public class SumNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Enter some numbers\nand then Enter 0 to calculate the sum of those numbers: ");
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("Sum of N numbers: " + sum);
    }
}
