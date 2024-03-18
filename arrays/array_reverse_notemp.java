import java.util.Scanner;

public class array_reverse_notemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.err.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int a = 0;
        int b = (arr.length) - 1;
        while (a<b) {
            arr[a] = arr[a] + arr[b];
            arr[b] = arr[a] - arr[b];
            arr[a] = arr[a] - arr[b];
            a++;
            b--;
        }
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                System.out.print("[ ");
            }
            System.out.print(arr[i] + " ");
            if (i==n-1) {
                System.out.print("]");
            }
        }
        sc.close();
    }
}
