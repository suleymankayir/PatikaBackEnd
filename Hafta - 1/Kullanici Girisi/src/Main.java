import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String userName,password;
        String realUserName = "patika";
        String realPassword = "java123";



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kullanici adini giriniz");
        userName = scanner.nextLine();
        System.out.println("Lütfen sifrenizi giriniz");
        password = scanner.nextLine();

        if (!(userName.equals(realUserName)) || !(password.equals(realPassword))) {
            System.out.println("Yanlis giris yaptiniz, sifrenizi sifirlanacaktir.");
            System.out.print("Lütfen yeni sifrenizi giriniz: ");
            String yeniSifre = scanner.nextLine();
            if (yeniSifre.equals(realPassword)){
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
            } else {
                System.out.println("Şifre oluşturuldu");
            }
        } else {
            System.out.println("Hosgeldiniz");
        }

    }
}