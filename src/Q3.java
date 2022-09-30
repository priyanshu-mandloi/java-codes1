import java.util.Scanner;
                                                   // Removing white space
public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String - ");
        String s =input.nextLine();
        s=s.replaceAll("\\s","");
        System.out.println(s);
    }
}
