package conditionals_loops;
//Factorial Program In Java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find Factorial");
        int fact=1, num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
