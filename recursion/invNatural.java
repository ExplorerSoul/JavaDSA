package recursion;

import java.util.Scanner;

public class invNatural {
    // static int cnt = 0;
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter N: ");
    //     int n = sc.nextInt();
    //     System.out.println("output: ");
    //     Natural(n);
    //     sc.close();
    // }
    

    // public static void Natural(int n){
    //     if(n == cnt){
    //         return;
    //     }
    //     else{
    //         System.out.println(n);
    //         n--;
    //         Natural(n);
    //     }
    // }


    // without global variable

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter N: ");
    //     int n = sc.nextInt();
    //     InvNum(1,n);
    //     sc.close();
    // }

    // public static void InvNum(int i,int n){
    //     if(i>n){
    //         return;
    //     }
    //     else{
    //         System.out.println(n);
    //         InvNum(i, n-1);
    //     }
    // }


    // by backtracking

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        F(1,n);
        sc.close();
    }

    public static void F(int i, int n){
        if (i>n) {
            return;
        }
        else{
            F(i+1,n);
            System.out.println(i);
        }
    }
}
