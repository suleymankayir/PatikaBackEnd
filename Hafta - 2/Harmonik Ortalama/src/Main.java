import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arr = {34, 55, 67, 44, 200, 55, 84};
        double total = 0;

        for (int i = 0; i < arr.length ; i++) {
            total +=  1.0 /arr[i];
        }

        double harmonicAverage = arr.length / total;
        System.out.println(harmonicAverage);


    }
}