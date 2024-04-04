package recursion;

import java.util.Scanner;

public class sumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int i = sc.nextInt();
        Sum(i,0);
        System.out.println("Sum is: " + S(i));
        sc.close();
    }

    //parameterised

    public static void Sum(int i, int sum){
        if (i<1) {
            System.out.println(sum);
            return;
        }
        else{
            Sum(i-1, sum+i);
        }
    }

    // functional

    public static int S(int n){
        if (n==0) {
            return 0;
        }
        else{
            return n+S(n-1);
        }
    }
}
