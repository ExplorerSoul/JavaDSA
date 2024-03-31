package linkedList;

public class Main {
    public static void main(String[] args) {

        // SINGLE LINKED LIST

        // LL list = new LL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertFirst(17);
        // list.insertLast(99);
        // list.insert(100,3);
        // list.display();
        // System.out.println(list.deleteFirst());
        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();
        // System.out.println(list.delete(2));
        // list.display();

        // DOUBLY LINKED LIST

        // DLL list = new DLL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertFirst(17);
        // list.insertLast(99);
        // list.insert(99 , 65);
        // list.display();

        // CIRCULAR LINKED LIST

        CLL list = new CLL();
        list.insert(23);
        list.insert(5);
        list.insert(3);
        list.insert(4);
        list.insert(8);
        list.display();
        list.delete(4);
        list.display();
    }
}
