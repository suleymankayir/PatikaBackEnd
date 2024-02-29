import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = scanner.nextInt();
        int basValue,rakamlarToplami = 0;

        while(sayi > 0) {
            basValue = sayi%10;
            rakamlarToplami += basValue;
            sayi/=10;
        }
        System.out.println(rakamlarToplami);
    }
}