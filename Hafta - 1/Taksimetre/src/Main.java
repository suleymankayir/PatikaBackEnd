import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int acilisUcreti = 10;
        double kmBasiUcret = 2.20;
        int minTutar = 20;
        double odenecekTutar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gidilen mesafeyi KM cinsinden yaziniz");
        double gidilenKM = scanner.nextDouble();

        odenecekTutar = (acilisUcreti)+ (kmBasiUcret*gidilenKM);

        System.out.println(odenecekTutar<20 ? minTutar: odenecekTutar);



    }
}