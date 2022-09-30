                         // Largest of three numbers

                         import java.util.Scanner;

                         public class pm12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        if (n1 > n2 || n1 > n3) {
            System.out.println("Greatest number is " + n1);
        } else if (n2 > n1 || n2 > n3) {
            System.out.println("Greatest number is " + n2);
        } else {
            System.out.println("Greatest number is " + n3);
        }
    }
}
