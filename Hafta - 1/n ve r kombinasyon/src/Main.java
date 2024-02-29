import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nFaktoriyel = 1, rFaktoriyel = 1, farkFaktoriyel = 1;
        int formul;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir n degeri giriniz");
        int n = scanner.nextInt();
        System.out.println("Lütfen bir r degeri giriniz");
        int r = scanner.nextInt();

        for (int i = 1; i <=n ; i++) {
            nFaktoriyel *= i;
        }

        for (int i = 1; i <= r ; i++) {
            rFaktoriyel *= i;
        }
        for (int i = 1; i <=(n-r) ; i++) {
            farkFaktoriyel *= i;
        }
        formul= nFaktoriyel / (rFaktoriyel * (farkFaktoriyel));
        System.out.println(n + "'in "+ r + "'li kombinasyonu "+ formul);
    }
}