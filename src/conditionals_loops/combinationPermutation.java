package conditionals_loops;
//Find Ncr & Npr
import java.util.Scanner;

public class combinationPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n and c values");
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n>=r)
        {
            System.out.println("The value of "+n+"P"+r+" is : "+permutation(n,r));
            System.out.println("The value of "+n+"C"+r+" is : "+combination(n,r));
        }
        else
            System.out.println("n value should be greater than or equals to r value");

    }
    static double permutation(int n,int r )
    {
        return (double) fact(n) /fact(n-r);
    }
    static double combination(int n,int r)
    {
        return (double) fact(n) /(fact(n-r)*fact(r));
    }
    public static int fact(int n){
        int fact=1;
        for(int i=1; i<=n;i++){
            fact *= i;
        }
        return fact;
    }
}
