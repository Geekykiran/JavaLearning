import java.util.Arrays;
import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(fun(sum, arr, n));
    }

    public static int fun(int sum, int[] arr, int n) {
        int sum1 = 0, product = 0;
        if(n<2) return -1;
        Arrays.sort(arr);
        for (int i = 0; i <= n; i++) {
            if(arr[i] != arr[i+1]) {
                sum1 = arr[i] + arr[i + 1];
                if (sum1 < sum) {
                    product = arr[i] * arr[i + 1];
                }
            }
        }
        return product;
    }
}


//def ProductSmallestPair(sum, arr)
//
//The function accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair
//
//NOTE
//
//Return -1 if array is empty or if n<2
//Return 0, if no such pairs found
//All computed values lie within integer range
//Example
//
//Input
//
//sum:9
//
//size of Arr = 7
//
//Arr:5 2 4 3 9 7 1
//
//Output
//
//2
//
//Explanation
//
//Pair of the least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2
//
//Sample Input
//
//sum:4
//
//size of Arr = 6
//
//Arr:9 8 3 -7 3 9
//
//Sample Output
//
//-21

//sort arr, i!=i