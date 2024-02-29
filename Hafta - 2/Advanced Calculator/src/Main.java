import java.util.Scanner;

public class Main {

    static int add(int a, int b) {
        int result = a + b;
        System.out.println("Toplamı : " + result);
        return result;
    }
    static int substract(int a, int b) {
        int result = a - b;
        System.out.println("Farkı : " + result);
        return result;
    }
    static int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("0 ile çarpımın sonucu her zaman 0'dır");
            return 0;
        }
        int result = a * b;
        System.out.println("Çarpım : " + result);
        return result;
    }
    static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci sayi 0 olamaz");

        }
        int result = a / b;
        System.out.println("Bölüm : " + result);

    }
    static int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(a + " üzeri " + b + " = " + result);
        return result;
    }
    // kodun gelinen asamasinda değişiklik yapmak istenilmediği icin 2 sayinin da faktöriyel hesabı yapilmistir.
    static int faktoryel(int a) {
        int result = 1;

        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Faktoriyel degeri" + result);
        return result;
    }
    static int modAlma(int a, int b) {
        int result = a % b;
        System.out.println("Mod: " + result);
        return result;
    }
    static int alanHesaplama(int a, int b) {
        int result = a * b;
        System.out.println("Dikdörtgen Alani: " + result);
        return result;

    }
    static int cevreHesaplama(int a, int b) {
        int result = 2 * (a + b);
        System.out.println("Dikdörtgen Çevresi: " + result);
        return result;
    }

    public static void main(String[] args) {

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "9- Çıkış";

        System.out.println(menu);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            int select = scanner.nextInt();
            if (select == 9) {
                break;
            }
            System.out.print("İşlem yapılacak ilk sayıyı giriniz: ");
            int ilkSayi = scanner.nextInt();
            System.out.print("İşlem yapılacak ikinci sayıyı giriniz: ");
            int ikinciSayi = scanner.nextInt();

            switch (select) {
                case 1:
                    add(ilkSayi, ikinciSayi);
                    break;
                case 2:
                    substract(ilkSayi, ikinciSayi);
                    break;
                case 3:
                    multiply(ilkSayi, ikinciSayi);
                    break;
                case 4:
                    divide(ilkSayi, ikinciSayi);
                    break;
                case 5:
                    pow(ilkSayi, ikinciSayi);
                    break;
                case 6:
                    faktoryel(ilkSayi);
                    break;
                case 7:
                    modAlma(ilkSayi, ikinciSayi);
                    break;
                case 8:
                    System.out.println("Lütfen Alan icin 1'i, Çevresi için 2'yi tuşlayınız");
                    int alanOrCevre = scanner.nextInt();
                    if (alanOrCevre == 1) {
                        alanHesaplama(ilkSayi, ikinciSayi);
                    } else if (alanOrCevre == 2) {
                        cevreHesaplama(ilkSayi, ikinciSayi);
                    } else {
                        System.out.println("Gecersiz bir giris yaptiniz.");
                    }
            }
        }
    }
}