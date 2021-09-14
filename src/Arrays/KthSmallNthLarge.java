package Arrays;

import java.util.Arrays;

public class KthSmallNthLarge {
    public static void main(String[] args) {
        int[] array={7 ,10, 4 ,3 ,20, 15};
        int k=3;
        int n=2;
        for(int i=0;i<array.length;i++){
            for(int j=0;j< array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]= array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array[k-1]+array[array.length-n]);
    }
}
