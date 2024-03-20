import java.util.Scanner;

public class array_copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[arr1.length];
        System.out.println("Enter elements of array 1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
        }
        System.out.println("Elements of array 1 is: ");
        for (int i=0; i<arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Elements of array 2 after copying is: ");
        for (int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        sc.close();
    }   
}
    