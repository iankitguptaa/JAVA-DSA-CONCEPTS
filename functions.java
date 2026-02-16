import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        // int ans = sum2();
        // System.out.println(ans);

        int ans = sum3(10, 20);
        System.out.println(ans);
    }

    // pass the value of numbers when you are calling the method in main
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second number : ");
        int b = sc.nextInt();
        int c = a + b;
        return c;
    }

    // take input from two numbers and print the sum.
    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second number : ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("the sum : " + c);
    }
}
