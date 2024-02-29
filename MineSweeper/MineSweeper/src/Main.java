import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Degerlendirme formu 7
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Row To Create : ");
            int row = scanner.nextInt();
            System.out.print("Column To Create : ");
            int column = scanner.nextInt();

            if (row >= 2 && column >= 2) {
                MineSweeper mineSweeper = new MineSweeper(row, column);
                mineSweeper.run();
                break;
            } else {
                System.out.println("Invalid row/column input!");
            }
        }

    }
}