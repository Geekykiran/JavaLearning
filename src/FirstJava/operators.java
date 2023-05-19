package FirstJava;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a and b values");
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = 0;
        System.out.println("Enter the operator i.e.,(+,-,*,/,%)");
        char op = in.next().charAt(0);
        if(op == '+') ans = a + b;
        else if(op == '-') ans = a - b;
        else if(op == '*') ans = a * b;
        else if(op == '/') ans = a / b;
        else if(op == '%') ans = b % a;
        System.out.println("Answer: "+ans);
    }
}
