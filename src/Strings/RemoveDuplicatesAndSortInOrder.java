package Strings;

import java.util.Arrays;

public class RemoveDuplicatesAndSortInOrder {
    public static void main(String[] args) {
        String s="cbacdcbc";
        char string[] = s.toLowerCase().toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++ ){
                if(s.charAt(i)==s.charAt(j)){
                  string[j]='0';
                }
            }
        }
        System.out.println(Arrays.toString(string));

        for(int i=0;i<string.length;i++){
            for(int j=0;j<string.length-1;j++){
                if(string[j]!='0'){
                    if (string[j] > string[j+1]) {
                        char temp = string[j];
                        string[j] = string[j + 1];
                        string[j + 1] = temp;
                    }
                    }
            }
        }

        for(int i=0;i<string.length;i++){
            if(string[i]!='0')
            System.out.print(string[i]);
        }

    }

}
