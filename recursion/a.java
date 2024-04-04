package recursion;

public class a {
    static int cut = 0;
    public static void main(String[] args) {
        
        f();
    }
    public static void f(){
        if (cut==5) {
            return;
        }
        else{
            System.out.println(cut);
            cut++;
            f();
        }
       
    }
}
