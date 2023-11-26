import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number and ending number: ");
        int f = sc.nextInt();
        int l = sc.nextInt();
        for (int i = f; i <= l; i++) {
            int num, rev = 0, d;
            num = i;
            while (num != 0) {
                d = num % 10;
                rev = rev * 10 + d;
                num = num / 10;
            }
            if (i == rev) System.out.println(i + " ");
        }
    }
}


/*Instructions: You are required to write the code. You can click on compile and run anytime to check compilation/execution status. The code should be logically/syntactically correct.

Question: Write a program in C such that it takes a lower limit and upper limit as inputs and print all the intermediate palindrome numbers.

Test Cases:

TestCase 1:
Input :
10 , 80
Expected Result:
11 , 22 , 33 , 44 , 55 , 66 , 77.

Test Case 2:
Input:
100,200
Expected Result:
101 , 111 , 121 , 131 , 141 , 151 , 161 , 171 , 181 , 191.*/