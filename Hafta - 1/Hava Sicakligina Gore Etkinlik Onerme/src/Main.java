import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int sicaklik;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen sicaklik degerini giriniz: ");
        sicaklik = scanner.nextInt();

        if (sicaklik < 5 ) {
            System.out.println("Kayak yapabilirsiniz");
        } else if (sicaklik < 15) {
            System.out.println("Sinemaya gidebilirsiniz");
        } else if (sicaklik < 25) {
            System.out.println("Pikniğe gidilebilir.");
        } else {
            System.out.println("Yüzmeye gidilmeli");
        }
    }
}