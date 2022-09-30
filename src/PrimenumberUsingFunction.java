import java.util.Scanner;

public class PrimenumberUsingFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number - ");
        int n = input.nextInt();
        boolean ans = PrimeNum(n);
        System.out.println(ans);
    }

    static boolean PrimeNum(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
