import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int input = scanner.nextInt();
        double toplam = 0;

        for (double i = 1; i <= input ; i++) {
            toplam += (1/i);
        }
        System.out.println(toplam);
    }
}