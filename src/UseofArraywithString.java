import java.util.Arrays;
import java.util.Scanner;
                                      // String in arrays
public class UseofArraywithString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
     //   System.out.print("Enter number - ");
       // int n= input.nextInt();
        String[] s= new String[4];
        System.out.print("Enter String - ");
        for(int i=0;i<s.length;i++){
            s[i]=input.nextLine();
        }
        System.out.println(Arrays.toString(s));

        // We can also modify our array
         s[1]="Priyanshu";
        System.out.println(Arrays.toString(s));
    }
}
