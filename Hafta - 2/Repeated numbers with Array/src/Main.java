import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int repeatCount = 0;
        int[] arr = {10,20,20,10,10,20,5,20};
        int [] repeatedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {

                    if (arr[i] == arr[j]){
                        repeatCount++;
                        if (!isRepeated(repeatedArr,arr[j])){
                            repeatedArr[i] = arr[j];

                        }
                    } //[10.20,5,0,0,0,0]
                        //
            }
            if (repeatedArr[i] != 0){
                System.out.println(repeatedArr[i] + " sayisi " + repeatCount+ " kere tekrar ediyor");
            }
            repeatCount = 0;

        }

    }

    public static boolean isRepeated(int[] arr, int value){
        for (int each : arr){
            if (each==value){
                return true;
            }
        }
        return false;
    }


}
/*





        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] repeatArr = new int[arr.length];
        int repeated = -1;
        for (int i = 0; i < arr.length; i++) {
            int repeatCount = 1;
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeatCount++;
                    repeatArr[j] = repeated;
                }
            }
            if (repeatArr[i] != repeated) {
                repeatArr[i] = repeatCount;
            }
        }

        for (int i = 0; i < repeatArr.length; i++) {
            if (repeatArr[i] != repeated) {
                System.out.println(arr[i] + " sayisi " + repeatArr[i] + " kere tekrar ediyor");
            }
        }
 */
