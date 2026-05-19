
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();

            // Stop if input is empty
            if (line.equals("")) {
                break;
            }

            String[] parts = line.split(" ");
            String first = parts[parts.length-1];
            System.out.println(first);
        }
    }
}
