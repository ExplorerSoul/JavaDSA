import java.util.Scanner;

public class pattern_10 {

    static void pattern(int n){
        for(int i=1; i<=2*n-1; i++){
            int star = i;
            if(i>n){
                star = 2*n-i;
            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
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
