import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 1, 0, 2, 5 };
        BubbleSortRecur(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSortRecur(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            BubbleSortRecur(arr, r, c + 1);
        } else {
            BubbleSortRecur(arr, r - 1, 0);
        }
    }
}
