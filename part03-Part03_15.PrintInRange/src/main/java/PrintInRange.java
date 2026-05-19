
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        printNumbersInRange(numbers, 0, 5);
    }
    
    public static void printNumbersInRange( ArrayList<Integer> deneme , int lower, int upper){
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer allList: deneme){
            if(allList >= lower && allList <= upper){
                result.add(allList);
            }
        }
        for(Integer results : result){
            System.out.println(results);
        }
    }
}
