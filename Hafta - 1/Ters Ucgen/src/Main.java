import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayisi giriniz: ");
        int basValue = scanner.nextInt();

        for (int i = basValue; i >0 ; i--) {

            for (int j = 0; j<(basValue-i) + 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
