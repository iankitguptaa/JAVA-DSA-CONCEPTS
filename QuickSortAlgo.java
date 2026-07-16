import java.util.Arrays;

public class QuickSortAlgo {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 4, 12, 5, 6 };
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void QuickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];
        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        QuickSort(nums, low, end);
        QuickSort(nums, start, high);
    }
}
