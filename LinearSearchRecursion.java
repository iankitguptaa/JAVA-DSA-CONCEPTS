public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 5 };
        System.out.println(LinearSearach(arr, 4, 0));
        System.out.println(LinearSearachInt(arr, 4, 0));
    }

    static boolean LinearSearach(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || LinearSearach(arr, target, index + 1);
    }

    // for integer
    static int LinearSearachInt(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return LinearSearachInt(arr, target, index + 1);
        }
    }
}
