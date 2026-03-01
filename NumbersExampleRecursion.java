public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n == 5) {
            System.out.println(5); // Base Condtion
            return;
        }
        System.out.println(n); // body
        print(n + 1); // recursive call
    }
}
