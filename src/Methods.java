import java.util.LinkedHashSet;
import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {
        System.out.println(reverseString("hello world"));
        System.out.println(countVowels("hello world"));
        System.out.println(isPalindrome("madam"));
        System.out.println(removeDuplicates("hello world"));
        String[] wordsArray = stringToWords("hello world");
        System.out.println(Arrays.toString(wordsArray));
    }

    public static String reverseString(String str) {

        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] chars = str.toCharArray();

        int start = 0;
        int end = chars.length - 1;


        while (start < end) {

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;

            end--;
        }
        return new String(chars);
    }

    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        str = str.toLowerCase();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        str = str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;

            end--;
        }

        return true;
    }

    public static String removeDuplicates(String str) {

        if (str == null || str.isEmpty()) {
            return str;
        }

        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            charSet.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : charSet) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static String[] stringToWords(String str) {

        if (str == null || str.isEmpty()) {
            return new String[0];
        }

        String[] words = str.split("\\s+");

        return words;
    }



}
