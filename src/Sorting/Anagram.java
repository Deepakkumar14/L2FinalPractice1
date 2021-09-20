package Sorting;

import java.util.ArrayList;

public class Anagram {
    public static void main(String[] args) {
        String str1="geeksforgeeks";
        String str2="forgeeksgeeks";
        char array1[] = str1.toCharArray();
        char array2[] = str2.toCharArray();
        int[] count = new int[256];
        for(int i = 0; i < array1.length;i++)
        {
            count[array1[i] - 'a']++;
            count[array2[i] - 'a']--;
        }
        Boolean bool=true;
        for(int i = 0; i < 256; i++){
            if (count[i] != 0)
            {
                bool=false;
            }
    }

            if(bool) {
                System.out.println(" Anagram");
            }else {
                System.out.println("Not Anagram");
            }
    }
}
