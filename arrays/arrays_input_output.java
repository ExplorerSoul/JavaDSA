import java.util.Arrays;
import java.util.Scanner;

public class arrays_input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " +n+ " array element: ");
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements in array are: ");
        for(int i=0; i<n; i++){
            if(i==0){
                System.out.print("[ ");
            }
            System.out.print(arr[i] + " ");
            if(i==n-1){
                System.out.print("]");
            }
        }
        sc.close();
    }
}
