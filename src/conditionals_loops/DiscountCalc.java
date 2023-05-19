package conditionals_loops;
//Calculate Discount Of Product
import java.util.Scanner;

public class DiscountCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product price: ");
        int price = sc.nextInt();
        System.out.println("Enter the number of items to be purchased");
        int numProducts = sc.nextInt();
        int fullPrice = price*numProducts;
        System.out.println("Enter the discount");
        int discount = sc.nextInt(); // percentage
        int discountPrice = (fullPrice * discount) / 100;
        int finalPrice = fullPrice - discountPrice;
        System.out.println("total price of the product = "+fullPrice);
        System.out.println("Discount for the product: "+ discountPrice);
        System.out.println("After applying the discount the final price = " + finalPrice);
    }
}
