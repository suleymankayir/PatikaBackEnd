import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int month;
        int day = 0;
        String sign;
        Scanner input = new Scanner (System. in);
        System.out.print ("Dogdugunuz Ay: ");
        month = input. nextInt();
        System.out.print ("Dogdugunuz Gün: ");
        day = input.nextInt();
        if (day<=31 && month <= 12){
            if (month == 1) {
                sign = day <= 21 ? "Oglak" : "Kova";
            } else if (month == 2) {
                sign = day <= 19 ? "Kova" : "Balik";
            } else if (month == 3) {
                sign = day <= 20 ? "Balik" : "Koç";
            } else if (month == 4) {
                sign = day <= 20 ? "Koç" : "Boga";
            } else if (month == 5) {
                sign = day <= 21 ? "Boga" : "Ikizler";
            } else if (month == 6) {
                sign = day <= 22 ? "Ikizler" : "Yengec";
            } else if (month == 7) {
                sign = day <= 22 ? "Yengec" : "Aslan";
            }else if (month == 8) {
                sign = day <= 22 ? "Aslan" : "Basak";
            }else if (month == 9) {
                sign = day <= 23 ? "Basak" : "Terazi";
            }else if(month == 10) {
                sign = day <= 23 ? "Terazi" : "Akrep";
            } else if (month == 11) {
                sign = day <= 21 ? "Akrep" : "Yay";
            }else {
                sign = day<=22 ? "Akrep" : "Oglak";
            }
            System.out.println(sign + " burcusunuz");
        } else {
            System.out.println("Gecersiz giris yaptiniz");
        }
    }
}

