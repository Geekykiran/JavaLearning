package FirstJava;
//Input currency in rupees and output in USD.
import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter INR to convert into USD: ");
        int inr = in.nextInt();
        double usd = inr/82.14;
        System.out.println("INR "+inr+" to USD : "+usd);
    }
}
