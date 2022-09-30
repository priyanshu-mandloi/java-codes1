
                               // Repetition of a number in an number

import java.util.Scanner;

public class pm15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = input.nextInt();
        int r;
        int i = 0;
        while (num > 0) {
            r = num % 10;
            if (r == 3) {
                i++;
            }
            num = num / 10;
        }
        System.out.println(i);
    }
}