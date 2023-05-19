package conditionals_loops;

import java.util.Scanner;

//Calculate Electricity Bill
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of units: ");
        int unit = sc.nextInt();
        double eBillAmount = 0;
        if(unit<=100){
            eBillAmount = unit * 1.20;
        }
        else if(unit <= 200){
            eBillAmount = 100 * 1.20 + (unit - 100)*2;
        }
        else if(unit <= 300){
            eBillAmount = 100 * 1.20 + (unit - 100) * 2;
        }
        else if(unit > 300){
            eBillAmount = 100 * 1.20 + 200 * 2 + (unit - 300) * 3;
        }
        System.out.println("The Electricity bill for "+unit+" is : "+eBillAmount);
    }
}
