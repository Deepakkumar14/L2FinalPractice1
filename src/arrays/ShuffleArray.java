package arrays;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,4,3,2,1};
        int[] output=new int[array.length];
        int j=0;
        for(int i=0;i< array.length/2;i++){
            output[j++]= array[i];
            output[j++]=array[i+((array.length)/2)];
        }
        System.out.println(Arrays.toString(output));
    }
}
