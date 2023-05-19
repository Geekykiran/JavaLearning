package FirstJava;
//To find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give a string: ");
        String str = in.nextLine();
        if(isPalindrome(str)) System.out.println("Given String is Palindrome");
        else System.out.println("Given String is not Palindrome");
    }
    public static Boolean isPalindrome(String str){
        int left = 0, right = str.length() -1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
