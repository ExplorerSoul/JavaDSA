import java.util.Scanner;

public class array_insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter elements: ");
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();   
        }
        System.out.print("Enter the element to insert at the end of the array: ");
        int element = sc.nextInt();
        arr[n] = element;
        insertAtEnd(8);
        sc.close();
    }
}

static int insertAtEnd(int e){
    int n = 5;
    int[] array = new int[n+1];
    array[n] = e;
    for (int j = 0; j < array.length; j++) {
        System.out.print(array[j] + " ");
    }
    return insertAtEnd(e);
}
