import java.util.Scanner;

public class ArmstrongNumUsingFunction {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n- ");
        int n=input.nextInt();
        boolean ans= ArmstrongNum(n);
        System.out.println(ans);
    }
    static boolean ArmstrongNum(int n){
        int m = n;
        int sum=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        return sum==m;
    }
}
