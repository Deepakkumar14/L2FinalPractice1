package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="geeksforgeeks";
        String str2="forgeeksgeezs";
        char array1[] = str1.toCharArray();
        char array2[] = str2.toCharArray();
        char[] count = new char[123];
        System.out.println(Arrays.toString(count));
        for(int i = 0; i < array1.length;i++)
        {
            count[array1[i] - 'a']++;
            count[array2[i] - 'a']--;
        }
        System.out.println(Arrays.toString(count));
        Boolean bool=true;
        for(int i = 0; i < 123; i++){
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
