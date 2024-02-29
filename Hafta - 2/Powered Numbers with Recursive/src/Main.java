import java.util.Scanner;

public class Main {

    static int power(int taban, int us) {
        if (us == 0) {
            return 1;
        }
        int result = 1;
        result = power(taban, us - 1) * taban; // calling method again

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban degerini giriniz: ");
        int tabanDeger = scanner.nextInt();
        System.out.print("Üs degerini giriniz: ");
        int usDeger = scanner.nextInt();

        System.out.println(power(tabanDeger, usDeger));

    }
}