import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ilkSayi,ikinciSayi,islem;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen islem yapilmasi istenen sayilari giriniz: ");

        ilkSayi = scanner.nextInt();
        ikinciSayi = scanner.nextInt();

        System.out.println("Asagidaki islemlerden birini secin");
        System.out.println("1 - Toplama\n2 - Cikarma\n3 - Carpma\n4 - Bolme");
        islem = scanner.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Sayilarin Toplami = " + (ilkSayi + ikinciSayi));
                break;
            case 2:
                System.out.println("Sayilarin Farki = " + (ilkSayi - ikinciSayi));
                break;
            case 3:
                System.out.println("Sayilarin Carpimi = "+(ilkSayi * ikinciSayi));
                break;
            case 4:
                System.out.println("Sayilarin Bölümü = " + (ilkSayi / ikinciSayi));
                break;
            default:
                System.out.println("Gecersiz bir islem sectiniz.");
                break;
        }



    }
}