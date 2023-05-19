package conditionals_loops;

import java.util.Scanner;
//Input a number and print all the factors of that number (use loops).
public class loops2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        var num = sc.nextInt();
        for(var i = 1; i <= num; i++){
            if(num%i == 0) System.out.print(i + ", ");
        }
    }
}
