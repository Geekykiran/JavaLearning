package conditionals_loops;

import java.util.Scanner;

public class loops1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(subtractProductAndSum(n))
       ;
    }
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n != 0) {
            product *= n % 10;
            sum += n % 10;
            n = n / 10;
        }
        return product - sum;
    }
    }
