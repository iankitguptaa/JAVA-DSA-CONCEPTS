public class MethodOverloading {
    public static void main(String[] args) {
        fun(67);
        fun("Ankit Gupta");
    }

    static void fun(int a) {
        System.out.println("First One");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second One");
        System.out.println(name);
    }
}
