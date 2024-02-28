import java.util.Scanner;

public class arrays_01 {
    public static void main(String[] args) {
        // Q. store a roll number
        int a = 19;

        // Q. store a person's name
        String name = "Amit Ranjan Das";

        // Q. store 5 roll numbers
        int rno1 = 12;
        int rno2 = 15;
        int rno3 = 25;
        int rno4 = 86;
        int rno5 = 42;

        // consider of storing 500 roll numbers

        //---------- ARRAY DATA STRUCTURE-----------

        /* An array is a collection of similar type of elements which has contiguous memory location.

        Java array is an object which contains elements of a similar data type 
        
        in Java, array is an object of a dynamically generated class. Java array inherits the Object class, and implements the Serializable as well as Cloneable interfaces. We can store primitive values or objects in an array in Java
        
        */


        //syntax
        // datatype[] variable_name = new datatype[size]

        // // store 5 roll numbers
        // int[] rnos = new int[5];
        // // or directly
        // int[] rnos2 = {23,56,54,96,3};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialization: actually here object is being created int memory (heap)
        
        // System.out.println(ros[1]);

        String[] arr = new String[4];
        // System.out.println(arr[0]); // prints null


        // actual happenings
        input(a);
        input_large(a);
        

    }

    static void input(int a){
        int[] arr = new int[5];

        arr[0] = 23;
        arr[1] = 125;
        arr[2] = 78;
        arr[3] = 455;
        arr[4] = 44;
        // [23, 125, 78, 455, 44]
        System.out.println(arr[3]);


    }

    static void input_large(int a){
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("[ ");
        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i]);
            if(i<arr1.length-1){
            System.out.print(", ");
            }
            else{
                System.out.println(" ]");
            }
        }
        sc.close();
    }
}
