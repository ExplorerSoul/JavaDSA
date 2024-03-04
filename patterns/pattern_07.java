import java.util.Scanner;

public class pattern_07 {

    static void pattern(int n){
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
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    pattern(n);
    scanner.close();
    }
}
