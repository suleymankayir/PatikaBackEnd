import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        int input = scanner.nextInt();

        for (int i = 4; i < input; i*=4) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (int i = 5; i < input; i*=5) {
            System.out.print(i + ",");
        }

    }
}
