package Sorting;

import java.util.Arrays;

public class SumClosestToZero {
    public static void main(String[] args) {
        int[] arr={-18,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int val=0;
        int min=Integer.MAX_VALUE;
       // int output=0;
        for(int i=0,j=arr.length-1;i<arr.length && j>0;){
            val=arr[i]+arr[j];
            if(Math.abs(val)<Math.abs(min)){
                min=val;
            }
             if(val < 0)
                 i++;
             else
                 j--;
        }
        System.out.println(min);
    }
}
