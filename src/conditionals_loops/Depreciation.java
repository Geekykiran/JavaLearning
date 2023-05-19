package conditionals_loops;
//Calculate Depreciation of Value
import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What's the Actual Price of the Product: ");
        int actualPrice = sc.nextInt();
        System.out.println("Enter the Current Selling Price of that same product: ");
        int currentPrice = sc.nextInt();
        System.out.println("Depreciation value of the product is " + (actualPrice - currentPrice));
    }
}
