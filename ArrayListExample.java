import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8765);

        System.out.println(list.contains(654));
        list.set(0, 99);
        list.remove(2);
        System.out.println(list);
    }
}
