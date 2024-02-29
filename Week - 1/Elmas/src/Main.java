import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int sayi = 5;
        for (int i = 1; i <sayi ; i++) {

            for (int j = 0; j < sayi-i ; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int i = sayi; i > 0 ; i--) {
            for (int j = 0; j < sayi-i ; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}