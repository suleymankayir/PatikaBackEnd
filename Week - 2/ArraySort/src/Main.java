import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen dizinin boyutunu giriniz: ");
        int size = scanner.nextInt();
        int [] arr = new int[size];
        System.out.println("Dizinin elemanlarini giriniz: ");
        for (int i = 0; i <size ; i++) {
            System.out.print((i+1) + ". elemani giriniz: ");
            arr[i] = scanner.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("Sıralama: " + Arrays.toString(arr));
    }
}