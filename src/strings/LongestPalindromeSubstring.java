package strings;

import java.util.ArrayList;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String s="racemalayalamecar";
        ArrayList<String> palindromes=new ArrayList<>();

        for(int i=0;i<s.length();i++) {
            for (int j = i; j < s.length(); j++) {
                String subString = s.substring(i, j + 1);
                if (check(subString)) {
                   palindromes.add(subString);
                }
            }
            }

        int length=0;
        String output="";
        for(int i=0;i<palindromes.size();i++){
            if(palindromes.get(i).length()>length){
                length=palindromes.get(i).length();
                output=palindromes.get(i);
            }
        }
        System.out.println(output);
    }

    public static boolean check(String subS)
    {
        int size = subS.length();
        for (int i = 0; i < size / 2; i++) {
            if (subS.charAt(i) != subS.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
