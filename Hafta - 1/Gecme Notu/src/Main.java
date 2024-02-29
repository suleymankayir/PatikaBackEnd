import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;
        int toplamNot = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        mat = scanner.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplamNot += mat;
        }

        System.out.print("Fizik notunu giriniz: ");
        fizik = scanner.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplamNot += fizik;
        }

        System.out.print("Turkce notunu giriniz: ");
        turkce = scanner.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplamNot += turkce;
        }

        System.out.print("Kimya notunu giriniz: ");
        kimya = scanner.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplamNot += kimya;
        }

        System.out.print("Muzik notunu giriniz: ");
        muzik = scanner.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplamNot += muzik;
        }

        int ortalama = toplamNot/5;
        if (ortalama > 55){
            System.out.println("Tebrikler geçtniz");
        } else {
            System.out.println("Notunuz: " + ortalama + " seneye tekrar deneyiniz");
        }
    }
}