package Patterns;

import java.util.Arrays;

public class LookAndSayPattern {
    public static void main(String[] args) {
        int n=8;
        String value="1";
        String[] array=new String[n];
        array[0]=value;
        for(int i=1;i<n;i++) {
            int len=value.length();
            String str="";
            int count=1;
            char temp=value.charAt(0);
            for(int j=1;j<len;j++){
                if (value.charAt(j)!=temp) {
                    str+=count;
                    str+=temp;
                    count=0;
                    temp=value.charAt(j);
                }
                count++;
            }
            str+=count;
            str+=temp;
            value=str;
            array[i]=str;
        }
        System.out.println(Arrays.toString(array));
    }
}
