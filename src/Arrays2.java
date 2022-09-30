import java.util.Arrays;
import java.util.Scanner;
                                        // Program for
public class Arrays2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n - ");
       int n= input.nextInt();
        String[] s=new String[n];
        for(int i=0;i<s.length;i++){
            s[i]= input.next();
        }
        // for printing array we use
        System.out.println(Arrays.toString(s));
    }
}
