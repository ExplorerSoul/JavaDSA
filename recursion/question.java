package recursion;


import java.util.Scanner;

public class question {
    // static int cnt = 0;
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter your name: ");
    //     String name = sc.nextLine();
    //     System.out.print("Enter number: ");
    //     int n = sc.nextInt();
    //     System.out.println("your name: ");
    //     Name(name,n);
    //     sc.close();
    // }
    // // print name n times
    // public static void Name(String name, int n){
    //     if (cnt == n) { // base condition
    //         return;
    //     }
    //     else{
    //         System.out.println(name);
    //         cnt++;
    //         Name(name,n); // recursion
    //     }
        
    // }

    // simpler method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        Naam(1,n);
        
        sc.close();
    }

    public static void Naam(int i, int n){
        if (i>n) {
            return;
        }
        else{
            System.out.println("amit");
            Naam(i+1, n);
        }
    }
}

