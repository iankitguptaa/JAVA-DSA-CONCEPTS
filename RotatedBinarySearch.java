public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 1, 2, 3, 4 };
        System.out.println(RotatedBinary(arr, 8, 0, arr.length - 1));
    }
    static int RotatedBinary(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return RotatedBinary(arr, target, start, mid - 1);
            } else {
                return RotatedBinary(arr, target, mid + 1, end);
            }
        }
        if (target >= arr[mid] && target <= arr[end]) {
            return RotatedBinary(arr, target, mid + 1, end);
        }
        return RotatedBinary(arr, target, start, mid - 1);
    }
}
