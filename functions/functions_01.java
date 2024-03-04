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
        // int ans = sum2();
        // System.out.println("the sum is: " + ans);
        // String message = greet();
        // System.out.println(message);
        // int ans = sum3(20, 30);
        // System.out.println(ans);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String naam = sc.next();
        // String person = myGreet(naam);
        // System.out.println(person);
        int a = 2;
        int b = 4;
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter 1st number");
        // int x = in.nextInt();
        // System.out.println("Enter 2nd number");
        // int y = in.nextInt();
        swap(a, b);
        // System.out.println(a + " " + b);// prints 2, 4 means no swaping happend
    }

    /*
        return_type name (argument) {
            //body
            return statement;
        }
     */

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);// mendatory for swaping
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
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
    // for void type we don't need to return anything
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2 ;
        System.out.println("the sum is: " + sum);
        
    }

    static String greet(){
        String greeting = "how are you ?";
        return greeting;
    }

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a+b ;
        return sum;
    }
}
