                                 // Min number in array

                                 import java.util.Scanner;

                                 public class pm22 {
    public static void main(String[] args) {
        int i;
      //  int []a={1,4,5,2,5};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of elements - ");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements in array- ");
        for(i=0;i<n;i++){
            a[i] = input.nextInt();
        }
        for(i=0;i<5;i++){
            if(a[0]>a[i]){
                a[0]=a[i];
            }
        }
        System.out.println( "Minimum number in array is : "+a[0]);
    }
}
