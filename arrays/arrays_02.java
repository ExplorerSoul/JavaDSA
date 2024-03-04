import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrays_02 {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
        */
        // syntax
        //  int[][] arr = new int[3][]; // not mendatory to specify the number of columns because it can vary 

        // int[][] arr = {
        //     {1, 2, 3},
        //     {4, 5},
        //     {6, 7, 8, 9}
        // };
        
        // Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[3][3];
        // System.out.println(arr.length); // prints number of rows of array
        // input
        // for(int row = 0; row<arr.length; row++){
        //     // for each col in every row
        //     for(int col = 0; col<arr[row].length; col++){
        //         arr[row][col] = sc.nextInt();
        //     }
        // }
        // output
        // 1st method
        // for(int row = 0; row<arr.length; row++){
        //     // for each col in every row
        //     for(int col = 0; col<arr[row].length; col++){
        //         System.out.print(arr[row][col] + " "); 
        //     }
        //     System.out.println();
        // }
        // 2nd method
        // for(int row = 0; row<arr.length; row++){
        //     // for each col in every row
        //     System.out.println(Arrays.toString(arr[row]));
        // }
        
        // enhanced for loop method
        // for(int[] a: arr){
        //     System.out.println(Arrays.toString(a));
        // }


        int[][] arr1 = {
            {1, 2, 3, 4},
            {5, 6},
            {7, 8, 9}
        };

        for(int row = 0; row<arr1.length; row++){
            for(int col = 0; col<arr1[row].length; col++){
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }

    }
}
