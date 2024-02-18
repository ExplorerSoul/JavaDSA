import java.util.Scanner;

public class pattern_09 {

    static void pattern1(int n){
        for(int row = 0; row<n; row++){
            // print spaces from col 1 to n-row-1
            for(int s=1; s<=n-row-1; s++){
                System.out.print(" ");
            }
            // after that print stars to col (2*row)+1
            for(int m=1; m<=2*row+1; m++){
                System.out.print("*");
            }
            // add new line
            System.out.println();
        }
    }
    static void pattern2(int n){
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
    pattern1(n);
    pattern2(n);

    scanner.close();
    }
}

