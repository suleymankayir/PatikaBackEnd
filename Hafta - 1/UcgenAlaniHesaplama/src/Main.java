import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("GIRILEN HER DEGER SONRASI ENTER'A BASINIZ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ucgenin kenar uzunluklarini giriniz: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double c = Math.sqrt((a * a) + (b * b));
        double u = (a + b + c) / 2;
        double alan = u * (u - a) * (u - b) * (u - c);
        System.out.println("Ucgenin alani "+ alan);



    }
}