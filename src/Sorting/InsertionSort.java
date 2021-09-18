package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array={-5,-2,5,2,4,7,1,-9,7,8,0,-8,1,-1};
        for(int i=1;i<array.length;i++){
            int key=array[i];
            int j=i-1;
            while(j>=0 && array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
        System.out.println(Arrays.toString(array));
    }
}
