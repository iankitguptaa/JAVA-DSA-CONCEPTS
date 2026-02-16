import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;

            case "Apple":
                System.out.println("A sweet red fruits");
                break;

            case "Orange":
                System.out.println("Round fruits");
                break;

            case "Grapes":
                System.out.println("small Friuts");
                break;
            default:
                System.out.println("Please Enter a valid friuts");
        }
    }
}
