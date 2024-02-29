import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println(randomNumber);

        int right = 0;
        while (right < 5) {

            System.out.println("Lütfen tahmininizi giriniz");
            int guessedNumber = scanner.nextInt();

            if (guessedNumber < 0 || guessedNumber > 99) {
                System.out.println("Lütfen 0 ile 100 arasinda bir rakam giriniz.");
            }
            if (randomNumber == guessedNumber) {
                System.out.println("Tebrikler");
                break;
            }
            if (guessedNumber < randomNumber) {
                System.out.println("Daha kucuk bir sayi girdiniz");
                right++;
                System.out.println("Kalan hakkınız: " + (5-right));
            }
            if (guessedNumber > randomNumber) {
                System.out.println("Daha buyuk bir sayi girdiniz");
                right++;
                System.out.println("Kalan hakkınız: " + (5-right));
            }
        }

    }
}