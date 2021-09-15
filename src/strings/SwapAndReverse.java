package strings;

import java.util.Arrays;

public class SwapAndReverse {
    public static void main(String[] args) {
        String input="Hello this is the GFG user";
        String[] array= input.split("\\s");

        String temp1=array[0];
        array[0]=array[array.length-1];
        array[array.length-1]=temp1;

        for(int i=array.length-2;i>=1;i--){
            char[] str=array[i].toCharArray();
            for(int j=0;j<str.length/2;j++){
                char temp=str[j];
                str[j]=str[str.length-j-1];
                str[str.length-j-1]=temp;
            }
            array[i]=new String(str);
        }

            for(int j=0;j<array.length/2;j++){
                String temp2=array[j];
                array[j]=array[array.length-j-1];
                array[array.length-j-1]=temp2;
        }


        System.out.println(Arrays.toString(array));
    }
}
