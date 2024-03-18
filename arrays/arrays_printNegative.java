import java.util.Scanner;

public class arrays_printNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " +(n)+ " elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Negative numbers are: ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
