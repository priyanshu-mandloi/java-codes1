import java.util.Arrays;
import java.util.Scanner;
                                         // Wanting to Swap an Array
public class SwappingArrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};      // declaration of an array
       // System.out.println("Enter the array -" );
        Swap(arr,3,4);
        Reverse(arr);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            Swap(arr,start,end);
            start++;
            end--;
        }
    }


    static void Swap(int[]  arr,int i1,int i2){
        int temp=0;
        temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }
}
