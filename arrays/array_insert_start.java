import java.util.Scanner;

public class array_insert_start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element: ");
        int size = sc.nextInt();
        int[] arr = new int[size+1];
        System.out.println("Enter "+size+ " elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to insert: ");
        int newElement = sc.nextInt();
        for (int i = size; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = newElement;
        System.out.println("The new array is: ");
        for (int i = 0; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
