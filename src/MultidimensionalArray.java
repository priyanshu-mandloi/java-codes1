import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int[][]arr=new int[3][3];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col < arr[row].length;col++){            //individual size of the row
                arr[row][col] = input.nextInt();
            }
        }

        // for printing two dimensional array.
//        for(int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        // **** by  using to string method
//            for(int row=0;row<arr.length;row++){
//                System.out.println(Arrays.toString(arr[row]));
//            }

            //******* By using for each loop
        for(int[] num:arr){                 // Here we every single Element is itself an array so data type here is an array.
            System.out.println(Arrays.toString(num));
        }
    }
}
