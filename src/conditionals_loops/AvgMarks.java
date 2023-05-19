package conditionals_loops;
//Calculate Average Marks
import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks out of 100 for each subjects to calculate Average marks");
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
        int avg = (lang+eng+math+sci+soSci)/5;
        System.out.println("Average Marks: "+avg);
    }

}
