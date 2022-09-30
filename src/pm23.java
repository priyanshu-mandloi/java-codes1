import java.util.Scanner;

public class pm23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of elements - ");
        int n = input.nextInt();
        int[] a = new int[n];
        int i;
        int j;
        int count = 0;
        int sum = 0;
        float avg = 0;
        System.out.println("Enter the elements in array :");
        for (i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        for (i = 0; i < n; i++)
        {
            boolean is_prime = true;

            // checking whether the number is prime or not!!
            for (j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    is_prime = false;
                    break;
                }
            }

            if (is_prime)
            {
                System.out.print(a[i] + " ");
                    sum = sum + a[i];
                    count++;
            }
        }
        System.out.println();
        System.out.println("Number of prime number - "+count);
                avg=(float)sum/count;
            System.out.println("Average of all prime number is : "+avg);
         // System.out.println(count);

    }
}




