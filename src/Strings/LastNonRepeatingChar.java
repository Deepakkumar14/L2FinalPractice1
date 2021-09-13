package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class LastNonRepeatingChar {
    public static void main(String[] args) {
        String s="DDeekppaak@";
        HashMap<Character,Integer> map=new HashMap<>();
        int value=1;
        boolean bool=false;
        char output=0;
        for(int i=0;i<s.length();i++) {
            if (map.containsKey(s.charAt(i))) {
                value=map.get(s.charAt(i));
                map.put(s.charAt(i),value+1);
                }
            else
                map.put(s.charAt(i),value);
        }
        for(int i=s.length()-1;i>=0;i--){
            if(map.get(s.charAt(i))==1){
                output=s.charAt(i);
                bool=true;
                break;
            }
        }
        if(bool){
            System.out.println(output);
        }
        else
            System.out.println("-1");
    }
}
