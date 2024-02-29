import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isWorking = true;
        while (isWorking) {

            System.out.println("Please choose your action:");
            System.out.println("1 - Write");
            System.out.println("2 - Read last text");
            System.out.println("0 - Exit");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    System.out.println("Please enter your text:");
                    scanner.nextLine();
                    String text = scanner.nextLine();
                    fileWrite(text);
                    break;
                case 2:
                    fileRead();
                    break;
                case 0:
                    System.out.println("Have a nice day!");
                    isWorking = false;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

        }
    }

    public static void fileRead() {

        try {
            FileReader fileReader = new FileReader("notlar.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
            reader.close();
        } catch (Exception e) {
            System.out.println("There is no text here :(");
        }

    }

    public static void fileWrite(String text) {

        try {
            FileWriter fileWriter = new FileWriter("notlar.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(text);
            writer.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}