import java.util.Scanner;
                                                      // Multidimensional array
public class Array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter n -");
        //int n = input.nextInt();
        int[][] arr = new int[3][2];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }

            // print karne ke liye
//            for (int row = 0; row < arr.length; row++) {
//                for (int col = 0; col < arr[row].length; col++) {
//                    System.out.println(arr[row][col]);
//                }
//                System.out.println();
//
//            }
//            // by enhanced for loop for printing array
//            for(int row=0;row<arr.length();row++){
//                System.out.println(arr[row]);
//            }
        }
    }
}
