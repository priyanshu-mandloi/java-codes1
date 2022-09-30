public class newbubblesort {
    int bubble_sort;
    public static void main(String[] args) {
        int[] a = {9, 5, 3, 1, 7};
        int temp=0;
        int i,j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]+"");
        }
    }
}
