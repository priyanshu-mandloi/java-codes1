                                        // funnction to swap an integer


import java.util.Scanner;

public class function1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a - ");
        int a= input.nextInt();
        System.out.print("Enter b - ");
        int b= input.nextInt();
        swap(a,b);
        String name= "Priyanshu Mandloi";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String name){
         name = "Jai";
    }
    static void swap(int p ,int q){
        int temp =p;
          p = q;
          q=temp;
        System.out.println(p+" "+q);
    }
}
