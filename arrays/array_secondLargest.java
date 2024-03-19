import java.util.Scanner;

public class array_secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " +n+ " elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int smax = 0;
        int max = arr[0];
        for(int i=0; i<n; i++){
            if (arr[i]>max) {
                smax = max;
                max = arr[i];
            }
        }
        System.out.println("Second largest element is: " +smax);
        sc.close();
    }
}
