import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    double kgArmut = 2.14;
    double kgElma = 3.67;
    double kgDomates = 1.11;
    double kgMuz = 0.95;
    double kgPatlican = 5.0;

    Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç kg armut istersiniz?");
        int armut = scanner.nextInt();
        System.out.println("Kaç kg elma istersiniz?");
        int elma = scanner.nextInt();
        System.out.println("Kaç kg domates istersiniz?");
        int domates = scanner.nextInt();
        System.out.println("Kaç kg muz istersiniz?");
        int muz = scanner.nextInt();
        System.out.println("Kaç kg patlican istersiniz?");
        int patlican = scanner.nextInt();

        double toplamTutar = (kgArmut*armut)+(kgElma*elma)+(kgDomates*domates)+(kgMuz*muz)+(kgPatlican*patlican);
        System.out.println("Armut Kaç Kilo ? :" + armut);
        System.out.println("Elma Kaç Kilo ? :" + elma);
        System.out.println("Domates Kaç Kilo ? :" + domates);
        System.out.println("Muz Kaç Kilo ? :" + muz);
        System.out.println("Patlıcan Kaç Kilo ? :" + patlican);
        System.out.println("Toplam Tutar : " + toplamTutar + " TL");

    }
}