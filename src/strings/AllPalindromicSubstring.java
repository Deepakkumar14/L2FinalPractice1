package strings;

import java.util.ArrayList;

public class AllPalindromicSubstring {
    public static void main(String[] args) {
        String s = "TENET";
        ArrayList<String> palindromes = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String subString = s.substring(i, j + 1);
                if (check(subString)) {
                    palindromes.add(subString);
                }
            }
        }
        System.out.println(palindromes);
    }
        public static boolean check(String sub)
        {
            int size = sub.length();
            for (int i = 0; i < size / 2; i++) {
                if (sub.charAt(i) != sub.charAt(size - i - 1)) {
                    return false;
                }
            }
            return true;
        }

    }

