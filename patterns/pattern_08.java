import java.util.Scanner;

public class pattern_08 {

    static void pattern(int n){
        for(int row = 0; row<n; row++){
            // print spaces from col 1 to n-row-1
            for(int s=0; s<row; s++){
                System.out.print(" ");
            }
            // after that print stars
            for(int m=(2*n)-(2*row+1); m>0; m--){
                System.out.print("*");
            }
            // add new line
            System.out.println();
        }
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    pattern(n);
    scanner.close();
    }
}

