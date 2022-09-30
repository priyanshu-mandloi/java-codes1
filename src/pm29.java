import java.util.Scanner;
                                               // good question related to the basic.
public class pm29 {
public static void main(String[] args){
double fahrenheit=62.5;
/* Convert */
double celsius = f2c(fahrenheit);
System.out.println(fahrenheit+'F'+"="+celsius+'C');
 }
  static double f2c(double fahr){
 return (fahr-32)*5/9;
 }
 }