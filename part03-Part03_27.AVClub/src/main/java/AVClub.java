
import java.util.Scanner;

public class AVClub {

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
                if(part.contains("av")){
                    System.out.println(part);
                }
            }
        }
    }
}
