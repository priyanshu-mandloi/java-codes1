import java.util.Scanner;

public class ArraylistOneDmensional {
    public static void main(String[] args) {
        java.util.ArrayList<Integer>list =new java.util.ArrayList<>(10);
        Scanner input=new Scanner(System.in);
        // input lena from user.
        System.out.print("Enter the elements in array - ");
        for(int i=0;i<5;i++){
            list.add(input.nextInt());
        }
        // Print the arraylist
        for(int i=0;i<5;i++){
        System.out.println(list.get(i));  // yha par list[index] syntax will not work here.
        }
        System.out.println(list);
    }
}


/*
                            Remenber the synatax of Array list
                            java.util.ArrayList<Integer>list=new java.util.ArrayList<>();
                                               (Wrapper class -> no primitive data type)


 */