import java.util.Scanner;

public class pattern_01 {
    
    static void pattern(int n) {
            // SQUARE PATTERN
            /*
             * # # # #
             * # # # #
             * # # # #
             * # # # #
             */
        // For loop 'row' in range 0 to N-1.
        for(int row = 0; row < n; row++)
        {
            // For loop 'col' in range 0 to N-1.
            for(int col = 0; col < n; col++)
            {
                // Print a '#'.
                System.out.print('#' + " ");
            }
            System.out.println();
        }
            /*
            Time Complexity : O(N^2) -> There are two nested loops and both are running exactly N times, so time complexity would be the order of NxN. Hence the time complexity is O(NxN). 

            Space complexity: O(1) -> Since we are using constant extra space. Hence the space complexity is O(1).

            Where N is the given input.
            */

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern(n);
        scanner.close();
    }
}