import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ondalikliSayi;
        double tamSayi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int i = scanner.nextInt();

        System.out.println("Lütfen ondalikli sayi giriniz");
        double j = scanner.nextDouble();

        ondalikliSayi = (int) j; // Explicit Narrowing

        tamSayi =  i; // Auto Widening

        System.out.println(tamSayi);
        System.out.println(ondalikliSayi);


    }
}