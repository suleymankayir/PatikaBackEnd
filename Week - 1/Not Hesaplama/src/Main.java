import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;
        int dersSayisi = 6;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik notunuz: ");
        mat = scanner.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = scanner.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = scanner.nextInt();

        System.out.println("Türkçe notunuz: ");
        turkce = scanner.nextInt();

        System.out.println("Tarih notunuz: ");
        tarih = scanner.nextInt();

        System.out.println("Müzik notunuz: ");
        muzik = scanner.nextInt();

        int notOrtalamasi = (mat+fizik+kimya+turkce+tarih+muzik)/dersSayisi;

        System.out.println((notOrtalamasi > 60) ? "Sınıfı Geçti " : "Sınıfta Kaldı" );



    }
}