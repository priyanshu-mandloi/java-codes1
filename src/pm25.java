import java.util.Arrays;

public class pm25 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println(maxArray(arr));
        System.out.println(minArray(arr));
//        System.out.println(isPrime(3));
        System.out.println(Arrays.toString(primeArray(arr)));
        System.out.println("Average of all prime numbers is: "+ averageArray(primeArray(arr)));
        System.out.println(maxArray(primeArray(arr)));
    }

    //Maximum of an array
    static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    //Minimum of an array
    static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }


    //To find all prime numbers of array
    static int[] primeArray(int[] arr){
        int numberOfPrime = numberPrime(arr);
        int[] ans = new int[numberOfPrime];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i])){
                ans[j] = arr[i];
                j++;
            }
        }
        return ans;
    }

    //Count the number of prime numbers
    static int numberPrime(int[] arr){
        int check = 0;
        for (int j : arr) {
            if (isPrime(j)) {
                check++;
            }
        }
        return check;
    }

    //To check if a number is prime or not
    static boolean isPrime(int num){
        if(num<=1) return false;
        int check = 2;
        while((check*check)<=num){
            if(num%check==0) return false;
            check++;
        }
        return (check*check)>num;
    }

    //To calculate average of an array
    static float averageArray(int[] arr){
        float sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (sum/arr.length);
    }

}
