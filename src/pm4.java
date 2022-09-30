
                                        // Program for temp conversion


import java.util.Scanner;

public class pm4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the temp in c: ");
        float c= in.nextFloat();
        float f =(c*9/5)+32;
        System.out.println(f);

    }
}
