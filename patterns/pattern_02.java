import java.util.Scanner;

public class pattern_02 {

    static void pattern(int n){
    /*
    Time Complexity : O(N^2) -> There are two nested loops, so time complexity would be the order of N*N.
    Space complexity: O(1) -> Since we are using constant extra space. 

    Where N is the given input.
    */
        // For loop 'row' in range 0 to N-1.
        for(int row = 0; row < n; row++)
        {
            // For loop 'col' in range 0 to row.
            for(int col = 0; col <= row; col++)
            {
                // Print '*'.
                System.out.print('#' + " ");
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
