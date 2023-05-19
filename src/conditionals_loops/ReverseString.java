package conditionals_loops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sting: ");
        String str = sc.nextLine();
        String revStr = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            revStr = ch+revStr;
        }
        System.out.println("Original String: "+str);
        System.out.println("Reversed String: "+revStr);
    }
}
