import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int r,aci;
        double pi = 3.14;
        double formul;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dairenin yaricapini giriniz");
        r = scanner.nextInt();
        System.out.println("Lutfen merkez aci ölcüsünü giriniz");
        aci = scanner.nextInt();

        formul = (pi * (r*r) * aci) / 360;
        System.out.println("Daire dilimi alani: "+ formul);
    }
}