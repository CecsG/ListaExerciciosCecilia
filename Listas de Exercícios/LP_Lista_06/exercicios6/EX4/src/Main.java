import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String word;

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter your word: ");
            word = in.next();
        } while (word.isEmpty());

        String lowerCase = word.toLowerCase();
        char[] array = lowerCase.toCharArray();

        if (verifyPalindrome(array, 0, array.length-1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        in.close();
    }

    public static boolean verifyPalindrome(char[] array, int start, int end) {
        while (start < end) {
            if (array[start] != array[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}