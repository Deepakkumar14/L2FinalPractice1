package arrays;

import java.util.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] array={4,-2};
        int k=1;
        int[] output=new int[array.length-k+1];
        for (int i=0;i<=array.length-k;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<k+i;j++){
                if(array[j]>max){
                    max=array[j];
                }
            }
            output[i]=max;
        }
        System.out.println(Arrays.toString(output));
    }
}
