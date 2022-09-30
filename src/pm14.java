
                               // Program on fibonacci series

import java.util.Scanner;

public class pm14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Enter the number to get fibonacci number = ");
        int num = input.nextInt();
        int r;
 int temp1=0;
int temp2=1,temp3;

for(int i=2;i<num;i++)
{
  temp3=temp2;
 temp2=temp2+temp1;                                 // Fibonacci series that should be printed is 0,1,1,2,3,5,8,13...
  temp1=temp3;
}
        System.out.print("Fibonacci number is = "+temp2);
}
}