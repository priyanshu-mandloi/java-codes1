
                                      // Q3

public class practice1 {
    static int evenOdd(int n){
        return n%2;
    }

    public static void main(String[] args) {
        if(args.length>0) {
            int num = Integer.parseInt(args[0]);
            int ans = evenOdd(num);
            if (ans == 0) System.out.println("Even");
            else System.out.println("Odd");
        }
        else System.out.println("No command line arguments");
    }
}
/*
public class practice2{
static int evenOdd(int n){
return n%2;
}
public static void main(String[] args){
if(args.length>0){
int num = Integer.parseInt(arg[0]);
int ans=evenOdd(num);
if(ans==0) System.out.println("Even");
else System.out.println("Odd");
}
else System.out.println("No command line argument");
}
///////////
static int evenOdd(int n)
{
return n%2;
}
psvm(String[] args){
if(args.length>0) {
int num=Integer.parseInt(args[0]);
int ans=evenOdd(num);
if(ans==0) sop("Even");
else sop ("odd");
}
else sout("No command prompt");
 */