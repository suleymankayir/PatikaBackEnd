import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int ilkSayi=1;
        int ikinciSayi =1;
        int sonuc = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen basamak sayisi giriniz: ");
        int n = scanner.nextInt();

        System.out.print(sonuc + " ");
        for (int i = 0; i < n; i++) {

            ilkSayi = ikinciSayi;
            ikinciSayi = sonuc;
            sonuc = ilkSayi + ikinciSayi;
            System.out.print(sonuc + " ");

        }





    }
}