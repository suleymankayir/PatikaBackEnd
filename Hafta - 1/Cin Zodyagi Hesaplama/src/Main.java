import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int birthDate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen doğum yılınızı giriniz");
        birthDate = scanner.nextInt();

        switch (birthDate % 12) {
            case 0:
                System.out.println("Cin Zodyagi Burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Cin Zodyagi Burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Cin Zodyagi Burcunuz : Köpek");
                break;
            case 3:
                System.out.println("Cin Zodyagi Burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Cin Zodyagi Burcunuz : Fare");
                break;
            case 5:
                System.out.println("Cin Zodyagi Burcunuz : Öküz");
                break;
            case 6:
                System.out.println("Cin Zodyagi Burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Cin Zodyagi Burcunuz : Tavsan");
                break;
            case 8:
                System.out.println("Cin Zodyagi Burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Cin Zodyagi Burcunuz : Yilan");
                break;
            case 10:
                System.out.println("Cin Zodyagi Burcunuz : At");
                break;
            case 11:
                System.out.println("Cin Zodyagi Burcunuz : Koyun");
                break;
            default:
                System.out.println("Gecersiz giris yaptiniz");
                break;
        }
    }
}