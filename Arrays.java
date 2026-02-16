public class Arrays {
    public static void main(String[] args) {
        // Store a roll no..
        int a = 19;
        // Store a person's name
        String name = "Ankit Gupta";
        // Store a 5 roll no.
        int roll1 = 23;
        int roll2 = 55;
        int roll3 = 18;

        // syntax
        // datatype[] variable_name = new datatype[size];
        // Store 5 roll no.
        int[] rnos = new int[5];
        // or directly;
        int[] rnos2 = { 23, 12, 45, 32, 15 };

        int[] ros; // decleration of array . ros is getting definrd in the stack
        ros = new int[5]; // initialisation : actually here oblect is being created in the memory(heap)

        // System.out.println(ros[0]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

    }
}
