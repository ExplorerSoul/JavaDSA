import java.util.Scanner;

public class arrays_even_odd_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " +n+ " array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int evenCount = 0, oddCount = 0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Total Even number: " +evenCount+ "\nTotal Odd number: " +oddCount);
    }
}
