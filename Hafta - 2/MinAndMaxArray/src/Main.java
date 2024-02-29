import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayi giriniz: ");
        int n = input.nextInt();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (n <= arr[0]) {
                System.out.println("Girilen sayi dizideki en küçük sayi");
                break;
            } else if (n < arr[i]) {
                System.out.println(arr[i - 1]);
                break;
            }

        }
        for (int i = arr.length - 1; i > 0; i--) {
            if (n >= arr[arr.length - 1]) {
                System.out.println("Girilen sayi dizideki en buyuk sayi");
                break;
            } else if (n > arr[i]) {
                System.out.println(arr[i + 1]);
                break;
            }
        }

    }
}