import java.util.Scanner;


public class pattern_05 {
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
            for(int col = 0; col < n; col++)
            {
                // If 'col' < N-'row', print  a '*'.
                if(col < (n-row))
                {
                    System.out.print("* ");
                }
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

