package FirstJava;
//To calculate Fibonacci Series up to n numbers.
public class Fibo {
    public static void main(String[] args) {
        int firsTerm = 0, secondTerm = 1, n=10;
        System.out.println("Fibonacci series to "+n+" :");
        System.out.print("0, 1");
        for(int i=0; i<=n; i++){
            int nexTerm = firsTerm + secondTerm;
            firsTerm = secondTerm;
            secondTerm = nexTerm;
            System.out.print(", "+nexTerm);
        }
    }
}
