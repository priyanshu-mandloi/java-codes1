
                                  // Reversing of a number

                                  import java.util.Scanner;

                                  public class pm16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nummber =");
        int n = input.nextInt();
        int i = 0;
        int r, rev = 0;
        // 123 = 321      , n=123,  r=n%10,,123%10=3 , n=n/10, 123/10=12, ....
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            rev = rev * 10 + r;
        }
        System.out.println("Reverse of a number is = "+rev);
    }
       }
