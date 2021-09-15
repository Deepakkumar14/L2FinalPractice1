package strings;

import java.util.LinkedHashMap;

public class SecondMostFrequentChar {
    public static void main(String[] args) {
        String s = "successes";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        int first=0,second=0;
        char firstChar=0,secondChar=0;
        int value = 1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
               int value1 = map.get(s.charAt(i));
                map.put(s.charAt(i), value1 + 1);
            } else
                map.put(s.charAt(i), value);
        }
        System.out.println(map);
            for (char c : map.keySet()) {
                if (map.get(c) > first) {
                    second = first;
                    secondChar = firstChar;
                    firstChar = c;
                    first = map.get(c);
                } else {
                    if (map.get(c) > second && map.get(c) < first) {
                        second = map.get(c);
                        secondChar = c;
                    }
                }
            }
        System.out.println(secondChar);

    }
    }


