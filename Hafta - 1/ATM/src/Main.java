import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String realUsername = "patika";
        String realPassword = "dev123";
        int remaniningRight = 3;
        int select;
        int balance = 1500;

        Scanner scanner = new Scanner(System.in);
        while (remaniningRight > 0) {
            System.out.print("Lütfen kullanici adini giriniz: ");
            String username = scanner.next();

            System.out.print("Lütfen şifrenizi giriniz :");
            String password = scanner.next();

            if (username.equals(realUsername) && password.equals(realPassword)) {
                do {
                    System.out.println("X Bank'a hoşgeldiniz. ");
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış Yap");
                    System.out.println("Lütfen yapmak istediginiz islemi secin: ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Lütfen yatirmak istediğiniz tutari giriniz: ");
                            int deposit = scanner.nextInt();
                            balance += deposit;
                            break;
                        case 2:
                            System.out.print("Lütfen çekmek istediğiniz tutari giriniz: ");
                            int withdraw = scanner.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Bakiye yetersiz\n");
                            } else {
                                balance -= withdraw;
                            }
                            break;
                        case 3:
                            System.out.print("Bakiyeniz: " + balance+"\n");
                            break;
                    }
                } while (!(select == 4)); {
                    System.out.println("Bankamızı tercih ettiğiniz icin tesekkür ederiz.");
                    break;
                }
            } else {
                remaniningRight--;
                System.out.println("Yanlış giris yaptiniz. Tekrar deneyiniz. ");
                if (remaniningRight == 0) {
                    System.out.println("Hesabınız bloke olmustur.");
                } else {
                    System.out.println("Kalan hakkiniz: " + remaniningRight);
                }
            }
        }
    }
}