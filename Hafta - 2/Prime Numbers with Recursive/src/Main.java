import java.util.Scanner;

public class Main {
    /*
    static boolean isPrime(int sayi, int bolen) {
        if (sayi < 2) {
            return false;
        } else if (bolen <= 1) {
            return true;

        } else {
            if (sayi % bolen == 0) {
                return false;
            } else {
                return isPrime(sayi, bolen - 1);
            }
        }

    }
    */

    static boolean isPrime(int sayi,int bolen){
        if (sayi <2){
            return false;
        } else if (sayi==bolen) {
            return true;
        } else {
            if (sayi%bolen ==0){
                return false;
            } else {
                return isPrime(sayi,bolen+1);
            }

        }

    }



    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        int n = scanner.nextInt();
        if (isPrime(n, n / 2)) {
            System.out.print(n + " ASALDIR.");
        } else {
            System.out.print(n + " ASAL değildir.");
        }
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int n = scanner.nextInt();
        System.out.println(isPrime(n,2));


    }
}
