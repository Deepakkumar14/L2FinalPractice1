package arrays;

import java.util.Arrays;

public class AlternatePosNev {
    public static void main(String[] args) {
        int[] array={-5,-2,5,2,4,7,1,-9,7,8,0,-8};
        int[] temp=new int[array.length];
        int last= array.length-1;
        int first=0;
        for(int i=0;i< array.length;i++){
            if (array[i] >= 0) {
            temp[first]= array[i];
            first++;
            }
            else {
                temp[last] = array[i];
                last--;
            }
        }
        int k=temp.length-1;
        int odd=1;
        int even=0;
        for(int i=0;i<=last;i++){
           array[even]=temp[i];
           if(temp[k]<0){
               array[odd]=temp[k];
               k--;
               odd+=2;
               even+=2;
           }
           else
               even++;
        }
        System.out.println(Arrays.toString(array));
    }
}
