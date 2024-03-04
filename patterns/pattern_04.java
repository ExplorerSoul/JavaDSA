import java.util.Scanner;


public class pattern_04 {
    /*
    Time Complexity : O(N^2)
    Space complexity: O(1)

    Where N is the given input.
*/


    static void pattern(int n){
        
        // For loop 'row' in range 1 to N.
        for(int row = 1; row <= n; row++)
        {
            // For loop 'col' in range 1 to row.
            for(int col = 1; col <= row; col++)
            {
                // Print the value 'row+1'.
                System.out.print((row) + " ");
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
