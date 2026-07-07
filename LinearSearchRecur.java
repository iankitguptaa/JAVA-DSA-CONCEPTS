public class LinearSearchRecur {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 1, 9, 2 };
        System.out.println(LinearSearch(arr, 1, 0));
        System.out.println(LinearSearchIndex(arr, 9, 0));
    }

    static boolean LinearSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || LinearSearch(arr, target, index + 1);
    }

    static int LinearSearchIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return LinearSearchIndex(arr, target, index + 1);
        }
    }
}
