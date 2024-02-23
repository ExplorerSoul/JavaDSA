import java.util.Scanner;

public class pattern_18 {

    static void print(int n){
        for(int i=0; i<n; i++){
            char ch = 'A' ;
            for(int j=0; j<=i; j++){
                System.out.print((char)(ch+n-i-1));
                ch++;
            }
            System.out.println();
        }
        // for(int i=0; i<n; i++){
        //     char ch = (char)('A'+n-1) ;
        //     for(int j=0; j<=i; j++){
        //         System.out.print((char)(ch) + " ");
        //         ch--;
        //     }
        //     System.out.println();
        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
