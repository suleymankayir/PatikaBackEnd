import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kg;
        double boy;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen m cinsinden ağırlığınızı giriniz");
        boy = scanner.nextDouble();

        System.out.println("Lütfen kg cinsinden ağırlığınızı giriniz");
        kg = scanner.nextInt();

        double vucutKitIndx = kg/(boy*boy);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : " + boy);
        System.out.println("Lütfen kilonuzu giriniz :" + kg);
        System.out.println("Vücut kitle indeksiniz: " + vucutKitIndx );


    }
}