public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome("asdf"));
    }

    public static String isPalindrome(String str) {

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) { // For loop for reversed word
            reversed += str.charAt(i);
        }

        return reversed;
    }
}