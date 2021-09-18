package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array={-5,-2,5,2,4,7,1,-9,7,8,0,-8,1,-1};
        for(int i=0;i<array.length;i++){
            for(int j=0;j< array.length-i-1;j++){
                if(array[j]>array[j+1])
                    swap(j,j+1,array);
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static int[] swap(int i, int j, int[] array){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        return array;
    }
}
