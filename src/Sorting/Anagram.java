package Sorting;

import java.util.ArrayList;

public class Anagram {
    public static void main(String[] args) {
        String str1="geeksforgeeks";
        String str2="forgeeksgeek";
        char array1[] = str1.toCharArray();
        char array2[] = str2.toCharArray();
        int[] count = new int[256];
        int i;
        for(i = 0; i < array1.length;)
        {
            count[array1[i] - 'a']++;
            count[array2[i] - 'a']--;
        }
            if(count.length==0) {
                System.out.println("Anagram");
            }else {
                System.out.println("Not Anagram");
            }
    }
}
