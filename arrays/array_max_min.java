import java.util.Scanner;

public class array_max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " +n+ " elements:");
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(min>arr[i]){
                min = arr[i];
            }
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Minimum elements is: " +min+ " and maximum element is: " +max);
        sc.close();
    }
}
