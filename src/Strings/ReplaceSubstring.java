package Strings;

import java.util.Arrays;

public class ReplaceSubstring {
    public static void main(String[] args) {
        String input="hellofox foxx fox hefoxl";
        String[] array=input.split("\\s");
        String input1="fox";
        String input2="cat";
        for(int i=0;i<array.length;i++){
            if(array[i].equals(input1)){
                array[i]=input2;
            }
            else{
                int k=0,j=0,count=0,startIndex=0,endIndex=0;
                char[] temp=array[i].toCharArray();
                        while(k<input1.length()&&j< temp.length) {
                            if(temp[j]==input1.charAt(k)) {
                                count++;
                                k++;
                            }
                            if(count==input1.length()) {
                                    endIndex=j;
                                startIndex=(endIndex-count)+1;

                                break;
                            }
                            j++;
                        }
                        if(endIndex>0){
                            int m=0;
                           for(int l=startIndex;l<=endIndex;l++){
                                temp[l]=input2.charAt(m);
                                m++;
                                }
                            String temp1 = new String(temp);
                            array[i] = temp1;
                        }

            }
        }
        System.out.println(Arrays.toString(array));
    }
}
