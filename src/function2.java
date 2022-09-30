import java.util.Arrays;
                                       // function ovrloading -> Matlab same name but different parameter.
public class function2 {
    public static void main(String[] args) {
        fun(10);                                    // here two functions are called. one of them will get excecuted first.
        fun("Priyanshu Mandloi");
    }
    static void  fun(int n){
        System.out.println("First one");
        System.out.println(n);
    }
    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
}
