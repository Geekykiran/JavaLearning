package conditionals_loops;
//Calculate Average Of N Numbers
import java.util.Scanner;

public class AvgNnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true){
            System.out.println("Enter some numbers\nand then Enter 0 to calculate the average of those numbers: ");
            int num = sc.nextInt();
            if(num==0){
                break;
            }
            sum += num;
            count++;
        }
        int avg=sum/count;
        System.out.println("Average of N numbers: "+avg);
    }
}
