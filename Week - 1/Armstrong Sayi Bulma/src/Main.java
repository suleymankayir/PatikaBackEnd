import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int input = scanner.nextInt();
        int sayi = input;
        int bolunenSayi = input;
        int basNumber = 0;
        int sayilarToplami = 1;
        int armstrongSayi = 0;
        // basamak sayisi bulma
        while (bolunenSayi !=0){
            bolunenSayi /= 10;
            basNumber++;
        }
        while (input > 0){
            for (int i = 1; i <=basNumber ; i++) {
                sayilarToplami *= (input %10) ;
            }
            armstrongSayi += sayilarToplami;
            sayilarToplami=1;
            input /=10;
        }
        if (armstrongSayi == sayi){
            System.out.println("Armstrong sayisi");
        } else {
            System.out.println("Armstrong sayisi degil");
        }

    }
}