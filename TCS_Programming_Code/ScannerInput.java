import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) {
            System.out.println("No Input");
            return;
        }

        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("No Input");
            return;
        }

        String[] parts = str.split("\\s+");

        for (String p : parts) {
            try {
                Integer.parseInt(p);
            } catch (Exception e) {
                System.out.println("Invalid Input");
                return;
            }
        }

        System.out.println("Valid Input");
    }
}
