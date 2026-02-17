public class LinearSearchAlgo {
    public static void main(String[] args) {
        int[] arr = { 23, 12, 34, 45, 67, 78, 90, 36 };
        int target = 45;
        System.out.println(linearSearch(arr, target));
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
