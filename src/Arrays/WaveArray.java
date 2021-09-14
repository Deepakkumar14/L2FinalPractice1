package Arrays;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] array={2,4,7,8,9,10};
        for(int i=0;i< array.length-1;i+=2){
            int temp=array[i];
            array[i]= array[i+1];
            array[i+1]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
