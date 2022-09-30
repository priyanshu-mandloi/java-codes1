

                              // Program for calculator


import java.util.Scanner;

public class pm17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans=0;
        while(true)
        {
            System.out.print("Enter the operator = ");
            char op = input.next().trim().charAt(0);
            if(op=='+'|| op=='*'|| op=='/'|| op=='%')
            {
                System.out.println("Enter two numbers: ");
                int num1= input.nextInt();
                int num2 = input.nextInt();
                System.out.println();
                if(op=='+')
            {
                ans=num1+num2;
            }
                if(op=='-')
                {
                    ans=num1-num2;
                }
                if(op=='*')
                {
                    ans=num1*num2;
                }
                if(op=='/')
                {
                    ans=num1/num2;
                }
                if(op=='%')
                {
                    ans=num1%num2;
                } else if (op=='x'|| op=='x') {
                    break;
                }
              //  else {
                //    System.out.println("Invalid operation !");
               // }
        System.out.println(ans);
            }
        }
    }
}
