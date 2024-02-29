import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 8, 8};
        int[] tempArr = new int[arr.length];
        int firstIndex = 0;
        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] % 2 == 0)) {
                if (!isFind(tempArr, arr[i])) {
                    tempArr[firstIndex++] = arr[i];
                }

            }
        }
        System.out.println(Arrays.toString(tempArr));

    }
}