public class MaxElement {
    public static void main(String[] args) {
        int[] arr = { 23, 12, 56, 34, 78, 98 };
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
