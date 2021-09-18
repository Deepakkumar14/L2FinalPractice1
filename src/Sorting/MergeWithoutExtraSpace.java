package Sorting;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int[] array1={1, 4, 9, 13};
        int[] array2={ 3, 5, 6, 8, 12};
        for(int i=0;i<array1.length;i++){
            if(array1[i]>array2[0]){
                int temp=array1[i];
                array1[i]=array2[0];
                array2[0]=temp;

                int key=array2[0];
                int j;
                for(j=1;j<array2.length && array2[j]<key;j++ ){
                    array2[j-1]=array2[j];
                }
                array2[j-1]=key;
            }
        }
        System.out.print(Arrays.toString(array1));
        System.out.print(Arrays.toString(array2));
    }
}
