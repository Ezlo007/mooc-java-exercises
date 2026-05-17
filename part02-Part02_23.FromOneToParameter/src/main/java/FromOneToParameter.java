

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number){
        int count = number;
        for(int i = 1; i<= count ; i++){
            System.out.println(i + "\n");
        }
    }

}
