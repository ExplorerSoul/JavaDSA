import java.util.Scanner;

public class pattern_19 {
    static void print(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=n-i-1; j++){
                System.out.print("*");
            }
            for(int k=0; k<2*i; k++){
                System.out.print(" ");
            }
            for(int j=0; j<=n-i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int k=0; k<2*(n-i-1); k++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
