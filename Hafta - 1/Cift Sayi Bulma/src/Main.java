import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ort = 0,toplam=0,sayi = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                ++sayi;
                toplam += i;
                ort = (toplam/sayi);

            }

        }
        System.out.println(ort);
    }
}