import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        yil =scanner.nextInt();

        if (yil % 400 == 0){
            System.out.println(yil + " bir artik yildir.");
        }else if((yil % 100 != 0) && (yil % 4 == 0)){
            System.out.println(yil + " bir artik yildir.");
        } else {
            System.out.println(yil + " bir artik yil degildir.");
        }
    }
}