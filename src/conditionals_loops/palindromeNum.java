package conditionals_loops;

import java.util.Scanner;

public class palindromeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = sc.nextLong();
        String orgNum = String.valueOf(num);
        String revStr = "";
        for(int i = orgNum.length()-1;i>=0;i--){
            revStr += orgNum.charAt(i);
        }
        if(orgNum.equals(revStr)){
            System.out.println("Given number is palindrome: ");
        }
        else System.out.println("Given number is not a palindrome");
    }
}
