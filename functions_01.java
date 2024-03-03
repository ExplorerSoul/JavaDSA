import java.util.Scanner;

public class functions_01 {
    public static void main(String[] args) {
        // Q: take input of 2 numbers and print the sum
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number 1: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter number 2: ");
        // int num2 = sc.nextInt();

        // int sum = num1 + num2 ;
        // System.out.println("Sum is: "  + sum);

        // if someone ask you to do the sum for 1000 times
        // sum(); // method calling
        int ans = sum2();
        System.out.println("the sum is: " + ans);
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2 ;
        return sum;
    }
    // static void sum(){
    //     Scanner in = new Scanner(System.in);
    //     System.out.print("Enter number 1: ");
    //     int num1 = in.nextInt();

    //     System.out.print("Enter number 2: ");
    //     int num2 = in.nextInt();

    //     int sum = num1 + num2 ;
    //     System.out.println("the sum is: " + sum);
        
    // }
}
