import java.util.ArrayList;
import java.util.Scanner;

public class MultidimensionalArrayList {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list =new ArrayList<>(10);
     for(int i=0;i<3;i++){
         list.add(new ArrayList<>());
     }
     for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
             list.get(i).add(input.nextInt());
         }
     }
         System.out.println(list);

    }
}





/*
         for 1d array-> ArrayList<Integer>list=new ArrayList<>();
         for 2D array-> ArrayList<ArrayList<Integer>>list=new ArrayList<>();
 */