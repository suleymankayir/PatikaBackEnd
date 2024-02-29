import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lüfen bir sayi giriniz: ");
        int num1 = scanner.nextInt();

        System.out.print("Lütfen bir sayi giriniz: ");
        int num2 = scanner.nextInt();
        int i = num1;

        if (num1 > num2 ) {
            num1 = num1 + num2;
            num2 = num1- num2;
            num1 = num1 - num2;
        }
        // EBOB
        while(i > 0) {
            if ((num1%i ==0) && (num2%i ==0)) {
                System.out.println("Girmiş oldugunuz sayilarin EBOB'u: " + i );
                break;
            }
            i--;
        }
        // EKOK
        while (i <= (num1*num2)) {
            if ((i%num1 ==0) && (i%num2 ==0)){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}