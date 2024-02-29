import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bolenlerToplami =0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                bolenlerToplami += i;
            }
        }
        if (sayi==bolenlerToplami){
            System.out.println(sayi + " mukemmel sayidir.");
        } else {
            System.out.println(sayi + " mukemmel sayi degildir.");
        }
    }
}