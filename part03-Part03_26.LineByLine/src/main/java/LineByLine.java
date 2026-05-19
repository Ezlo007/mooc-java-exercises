import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();

            // Stop if input is empty
            if (line.equals("")) {
                break;
            }

            String[] parts = line.split(" ");

            for (String part : parts) {
                System.out.println(part);
            }
        }
    }
}