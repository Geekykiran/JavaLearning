import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c >= 1 && c <= 4) {
            System.out.println(fun(a, b, c));
        }
        else System.out.println("c value should be between 1-4");
    }

    public static int fun(int a, int b, int c) {
        return switch (c) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> a / b;
            default -> 0;
        };
    }
}

/*Int OperationChoices(int c, int n, int a , int b )

The function accepts 3 positive integers ‘a’ , ‘b’ and ‘c ‘ as its arguments. Implement the function to return.

( a+ b ) , if c=1
( a – b ) , if c=2
( a * b ) ,  if c=3
(a / b) ,  if c =4
Assumption : All operations will result in integer output.

Example:

Input
c :1
a:12
b:16
Output:
Since ‘c’=1 , (12+16) is performed which is equal to 28 , hence 28 is returned.
Sample Input

 c : 2

 a : 16

 b : 20

Sample Output

-4*/