import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        int toplam=0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Lütfen cift bir sayi giriniz: ");
            input = scanner.nextInt();
            if ((input%2==0) && (input%4==0)){
                toplam += input;
            }
        }while (input%2==0);
        System.out.print("Girmis oldugunuz cift ve 4'e bolunen sayilar toplami: " + toplam);
    }
}