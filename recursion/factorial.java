package recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Factorial of N is: " + Factorial(n));
        sc.close();
    }

    public static int Factorial(int n){
        if (n==0) {
            return 1;
        }
        if (n==1) {
            return 1;
        }
        else{
            return n*Factorial(n-1);
        }
    }
}
