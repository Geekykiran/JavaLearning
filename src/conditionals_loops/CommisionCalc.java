package conditionals_loops;
//Calculate Commission Percentage
import java.util.Scanner;

public class CommisionCalc {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the product price: ");
            int price = sc.nextInt();
            System.out.println("Enter the number of items to be purchased");
            int numProducts = sc.nextInt();
            int fullPrice = price*numProducts;
            System.out.println("Enter the commission");
            int commision = sc.nextInt(); // percentage
            int commisionPrice = (fullPrice * commision) / 100;
            System.out.println("total price of the product = "+fullPrice);
            System.out.println("commission for the product: "+ commisionPrice);
        }
}
