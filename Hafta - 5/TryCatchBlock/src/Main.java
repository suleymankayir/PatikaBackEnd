import java.util.Scanner;

public class Main {


    public static void printArr(int[] arr, int index) throws CustomArrException {

        if (index >= arr.length) {
            throw new CustomArrException("Dizi dışına çıktınız");
        }
        System.out.print(arr[index]);

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter index number");
        int index = scanner.nextInt();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            printArr(arr, index);
        } catch (CustomArrException e) {
            System.out.println(e.getMessage());
        }

    }


}