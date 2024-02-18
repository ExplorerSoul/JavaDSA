import java.util.Scanner;

public class pattern_14 {

    static void pattern(int n){
        
        
        for(int i=1; i<=n; i++){
            char a = 'A';
            for(int j=1; j<=i; j++){
                System.out.print(a + " ");
                a++;
            }
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
