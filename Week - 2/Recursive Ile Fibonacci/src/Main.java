import java.util.Scanner;

public class Main {

    static int fibonacci(int basValue) {
        if (basValue == 1 || basValue == 2) {
            return 1;
        }

        return fibonacci(basValue - 1) + fibonacci(basValue - 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }


    }
}