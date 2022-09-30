                              // Program for factorial

                              import java.util.Scanner;

                              public class pm11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no whose factorial has to be calculated = ");
        int num=input.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of a number is = "+fact);
    }
}
