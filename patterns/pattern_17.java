import java.util.Scanner;

public class pattern_17 {

    static void print(int n){
        for(int i=0 ; i<n; i++){
            for(int s=0; s<n-i-1; s++){
                System.out.print(" ");
            }
            char ch = 'A';
            for(int j=1; j<=2*i+1; j++){
                System.out.print(ch);
                if(j<=(2*i+1)/2){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print(n);
        scanner.close();
    }
}
