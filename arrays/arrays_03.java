import java.util.ArrayList;
import java.util.Scanner;

public class arrays_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(67);
        // list.add(675);
        // list.add(6745);
        // list.add(87);
        // list.add(865);
        

        // System.out.println(list.contains(67)
        // );
        // list.set(0, 99);
        // list.remove(2);
        // System.out.println(list);

        // input
        for(int i = 0; i<5; i++){
            list.add(sc.nextInt());
        }
        // get items at any index
        for(int i = 0; i<5; i++){
            System.out.print(list.get(i));  // pass index here, list[index] syntax will not work here
        }
        sc.close();
    }
}
