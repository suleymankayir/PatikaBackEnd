
import java.util.Scanner;

public class Main {

    static void desenOlusturma(int sayi, int baslangicSayi, boolean durum) {

        System.out.print(sayi + " ");

        if (sayi <= 0) {
            desenOlusturma(sayi + 5, baslangicSayi, true);
        } else if (sayi > 0 && durum == false) {
            desenOlusturma(sayi - 5, baslangicSayi, false);
        } else if (sayi > 0 && sayi != baslangicSayi && durum==true) {
            desenOlusturma(sayi + 5, baslangicSayi, true);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = scanner.nextInt();
        desenOlusturma(sayi, sayi, false);
    }
}



