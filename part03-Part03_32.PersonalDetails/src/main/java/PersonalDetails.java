
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name ="";
        int avg = 0;
        int count= 0;
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }

            String[] parts = line.split(",");
            if(parts[0].length()> name.length()){
                name=parts[0];
            }
            avg += Integer.valueOf(parts[1]);  
            count++;          
        }   
        //Longest name: 
        System.out.println("Longest name: " + name);
        // Average of the birth years: 2014.8
        System.out.println("Average of the birth years: " + (double) avg/count);

    }
}
