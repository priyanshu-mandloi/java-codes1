import java.util.Arrays;
import java.util.Scanner;
                                                   //  Basics of the array
public class Array1 {
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
        System.out.print("Enter n - ");
       int n = input.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<arr.length;i++){
                  arr[i]= input.nextInt();
       }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(" "+arr[i]);
//        }

        // By using for each loop
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
        // More better approach to print an array.
        System.out.println(Arrays.toString(arr));
    }
}
