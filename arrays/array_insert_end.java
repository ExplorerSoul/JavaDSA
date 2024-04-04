import java.util.Scanner;

public class array_insert_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size+1];
        System.out.println("Enter " +size+ " elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be inserted: ");
        arr[size] = sc.nextInt();
        System.out.println("The new array is: ");
        for (int i = 0; i < size+1; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
