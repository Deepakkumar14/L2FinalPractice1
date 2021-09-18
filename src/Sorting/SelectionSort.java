package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array={-5,-2,5,2,4,7,1,-9,7,8,0,-8};
        for(int i=0;i<array.length-1;i++){
            int min=i;
            for(int j=i+1;j< array.length;j++){
                if(array[j]<array[min])
                    min=j;
            }
            swap(i,min,array);
        }

    }
    public static int[] swap(int i, int j, int[] array){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        return array;
    }
}
