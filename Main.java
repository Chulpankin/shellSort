import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] a = new int[] {55, 65, 11, 24, 98, 5, 7, 1};
//        shellSort(a);
//        System.out.println(Arrays.toString(a));
    }

    public static int shellSort(int[] a) {
        int n = a.length;
        int count = 0;
        for (int step = n / 2; step > 0; step /= 2) {
            for (int i = step; i < n; i++) {
                for (int j = i - step; j >= 0; j -= step) {
                    if (a[j] > a[j + step]) {
                        swap(a, j, j + step);
                    }
                    count++;
                }
            }
        }
        return count;
    }

    public static void swap(int[] a, int i, int j) {
        int x = a[i];
        a[i] = a[j];
        a[j] = x;
    }
}