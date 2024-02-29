import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int wordCount = 0;
        int maxValue = Integer.MIN_VALUE;
        String mostRepeatedWord = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write your sentence: ");
        String text = scanner.nextLine();
        String[] textArr = text.split(" ");
        for (int i = 0; i < textArr.length; i++) {
            for (int j = 0; j < textArr.length; j++) {
                if (textArr[i].equals(textArr[j])) {
                    wordCount++;
                }
            }
            map.put(textArr[i], wordCount);
            wordCount = 0;
        }
        for (String i : map.keySet()) {
              if (map.get(i)>maxValue){
                  maxValue = map.get(i);
                  mostRepeatedWord = i;
              }
        }
        System.out.println("Most common word is : " + mostRepeatedWord + " and it repeats " + maxValue + " times.");
    }
}