package logicalQuestions;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println("It is an anagram");
        } else {
            System.out.println("It is not an anagram");
        }
    }
    public static boolean isAnagram(String str1, String str2) {
        // 1. Remove spaces and convert to lowercase
    	
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // 2. Check if lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // 3. Convert strings to character arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // 4. Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}