
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            String[] parts = line.split(",");
            names.add(parts[0]);
            ages.add(Integer.valueOf(parts[1]));

            int age = Integer.valueOf(parts[1]);
            if(age > oldest){
                oldest = age;
            }
        }   
        int location = ages.indexOf(oldest);
        System.out.println("Name of the oldest: " + names.get(location));

        //Amele çözumu
    }
}
