package FirstJava;

import java.util.Scanner;

//To find Armstrong Number between two given number.
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interval for the range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        findArmstrong(a,b);
    }
    public static void findArmstrong(int a, int b){
        for(int i=a; i<=b;i++){
            int num = i, sum = 0 ;
            while (num>0){
                int rem = num%10;
                sum = sum+(rem*rem*rem);
                num = num/10;
            }
            if (sum == i) {
                System.out.println(sum);
            }
        }

    }
}
