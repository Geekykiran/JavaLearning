import java.util.Scanner;

public class Strings4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        System.out.println(fun(str.toLowerCase(), c1, c2));
    }

    public static String fun(String str, char c1, char c2) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(c1 == str.charAt(i)){
                res = res + c2;
            } else if (c2 == str.charAt(i)) {
                res = res + c1;
            }
            else res = res + str.charAt(i);
        }
        return res;
    }
}


/*You are given a function,

Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);

The function accepts a string  ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as its arguments . Implement the function to modify and return the string ‘ str’ in such a way that all occurrences of ‘ch1’ in original string are replaced by ‘ch2’ and all occurrences of ‘ch2’  in original string are replaced by ‘ch1’.

Assumption: String Contains only lower-case alphabetical letters.

Note:

Return null if string is null.
If both characters are not present in string or both of them are same , then return the string unchanged.
Example:

Input:
Str: apples
ch1:a
ch2:p
Output:
paales
Explanation:

‘A’ in original string is replaced with ‘p’ and ‘p’ in original string is replaced with ‘a’, thus output is paales.*/