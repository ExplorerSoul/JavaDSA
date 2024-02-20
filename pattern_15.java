import java.util.Scanner;

public class pattern_15 {

    static void pattern(int n){
        
        
        for(int i=1; i<=n; i++){
            char a = 'A';
            for(int j=n; j>=i; j--){
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
