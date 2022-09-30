import java.util.Scanner;

// Maximum of a no in array
public class pm21 {
                            public static void main(String[] args) {
                            //    int []a={1,8,4,6,9};
                                Scanner input = new Scanner(System.in);
                                System.out.println("Enter no of elements - ");
                                int n = input.nextInt();
                                int[] a = new int[n];
                                System.out.println("Enter the elements in array- ");
                                for(int i=0;i<n;i++){
                                    a[i] = input.nextInt();
                                }
                                for(int i=0;i<n;i++){
                                    if(a[0]<a[i]){
                                        a[0]=a[i];
                                    }
                                }
                                System.out.println("Maximum number in array is : "+a[0]);
                            }
                            }

