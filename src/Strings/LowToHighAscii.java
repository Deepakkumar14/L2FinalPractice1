package Strings;

public class LowToHighAscii {
    public static void main(String[] args) {
        String s="Hey HoW Are You";
        char[] array=s.toCharArray();
        for(int i=0;i<array.length;i++){
            if(array[i]>='A'&&array[i]<='Z'){
              array[i] = (char)((int) s.charAt(i)+32);
            }
           else if(array[i]>='a'&&array[i]<='z'){
                array[i] = (char)((int) s.charAt(i)-32);
            }
        }
        System.out.println(String.valueOf(array));
    }
}
