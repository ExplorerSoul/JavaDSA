package recursion;

import java.util.Scanner;

public class natural {
    // static int cnt = 1;
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter N: ");
    //     int n = sc.nextInt();
    //     System.out.println("output: ");
    //     Natural(n);
    //     sc.close();
    // }

    
    // public static void Natural(int n){
    //     if(cnt == n+1){
    //         return;
    //     }
    //     else{
    //         System.out.println(cnt);
    //         cnt++;
    //         Natural(n);
    //     }
    // }

    // without gobal variable

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter N: ");
    //     int n = sc.nextInt();
    //     Num(1,n);
    //     sc.close();
    // }


    // public static void Num(int i, int n){
    //     if (i>n) {
    //         return;
    //     }
    //     else{
    //         System.out.println(i);
    //         Num(i+1, n);
    //     }
    // }


    // By backtracking f(i+1,n) X

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        F(n,n);
        sc.close();
    }


    public static void F(int i, int n){
        if (i<1) {
            return;
        }
        else{
            F(i-1,n);
            System.out.println(i);
        }
    }
}
