import java.util.Scanner;


public class pattern_06 {
    /*
    Time Complexity : O(N^2)
    Space complexity: O(1)

    Where N is the given input.
*/


    static void pattern(int n){
        
        // For loop 'row' in range 0 to N-1.
        for(int row = 0; row < n; row++)
        {
            // For loop 'col' in range 0 to row.
            for(int col = 1; col < n-row+1; col++)
            {
               System.out.print(col + " ");
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

