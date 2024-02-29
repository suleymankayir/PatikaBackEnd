import java.util.Scanner;

public class KdvHesaplama {

    public static void main(String[] args) {

        double KDV;
        double tutar;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen KDV'sinin hesaplanmasini istediğiniz tutarı giriniz");
        double hesaplanacakTutar = scanner.nextDouble();

        if ((hesaplanacakTutar>0) && (hesaplanacakTutar<1000)){
            KDV = (hesaplanacakTutar*18/100);
            tutar = hesaplanacakTutar+KDV;
            System.out.println(tutar);
        } else if (hesaplanacakTutar>1000){
            KDV = (hesaplanacakTutar*8/100);
            tutar = hesaplanacakTutar+KDV;
            System.out.println(tutar);
        } else {
            System.out.println("Lütfen gecerli bir miktar giriniz");
        }

    }
}
