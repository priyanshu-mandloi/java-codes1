import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
                                        // yse of for each loop for printing the elements in arrray
public class UseOfForeachloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        // We need to declare  the array -> Syntax of declaring the array
        System.out.print("Enter elements in array - ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // *** By for each loop

//            for (int num : arr) {                            // Here num represents the elemennts of array
//                System.out.print(" " + num);                 // Matlab for every element in the array print the element
//            }
//


        // ************* Another method of printing an array by using method
        System.out.println(Arrays.toString(arr));



        }
    }
