package conditionals_loops;
//Calculate CGPA Java Program
import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks out of 100 for each subjects to calculate CGPA");
        System.out.println("Language: ");
        int lang = sc.nextInt();
        System.out.println("English: ");
        int eng = sc.nextInt();
        System.out.println("Maths: ");
        int math = sc.nextInt();
        System.out.println("Science: ");
        int sci = sc.nextInt();
        System.out.println("Social Science: ");
        int soSci = sc.nextInt();
        double cgpa = (double) ((lang + eng + math + sci + soSci) / 100) * 10.0;
        System.out.println(cgpa/5.0);
    }
}
