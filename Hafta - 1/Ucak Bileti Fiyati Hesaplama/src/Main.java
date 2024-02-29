import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km,yas = 0,tip = 0;
        double indirimTutari;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        km = scanner.nextInt();
        if (km < 0){
            System.out.println("Hatalı Veri Girdiniz !");
        } else{
            double mesafeÜcreti = km * 0.10 ;
            System.out.print("Yasinizi giriniz: ");
            yas = scanner.nextInt();
            if (yas < 0){
                System.out.println("Hatalı Veri Girdiniz !");
            } else{

                if (yas < 12) {
                    indirimTutari = mesafeÜcreti*0.5;
                    mesafeÜcreti -= indirimTutari;

                } else if (yas < 24){
                    indirimTutari = mesafeÜcreti*0.1;
                    mesafeÜcreti -= indirimTutari;

                } else if (yas > 65){
                    indirimTutari = mesafeÜcreti*0.3;
                    mesafeÜcreti -= indirimTutari;

                }
                System.out.print("Yolculuk tipinizi giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
                tip = scanner.nextInt();
                if (!((tip == 1) || (tip == 2) )){
                    System.out.println("Hatalı Veri Girdiniz !");
                } else {
                    if (tip == 2){
                        indirimTutari = mesafeÜcreti*0.2;
                        mesafeÜcreti -= indirimTutari;
                        mesafeÜcreti *= 2;
                        System.out.println("Toplam Tutar = " + mesafeÜcreti + " TL");
                    } else if (tip == 1){
                        System.out.println("Toplam Tutar = " + mesafeÜcreti + " TL");
                    }
                }
            }
        }













    }
}