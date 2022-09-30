import java.util.Arrays;
import java.util.Scanner;
                                      // Changing the  value at index.

public class ArraysPassinginfunction {
    public static void main(String[] args) {
        int[] arr={1,3,5,67,7};
        System.out.println(Arrays.toString(arr));
        Scanner input=new Scanner(System.in);
        System.out.print("Enter index - ");
        int i = input.nextInt();
        System.out.print("Enter value  - ");
        int value = input.nextInt();
           Change(arr,i,value);
        System.out.println(Arrays.toString(arr));
    }
    static void Change(int[] num,int i,int value){
        num[i]=value;
    }
}
