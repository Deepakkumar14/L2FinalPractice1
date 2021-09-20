package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyStore {
    public static void main(String[] args) {
       int N = 11;
        int K = 1;
        long candies[] = {3, 2, 1, 4,5,6,7,8,9,10,11};
            int lower=0;
            int upper= candies.length-1;
            quickSort(candies,lower,upper);
        System.out.println(Arrays.toString(candies));
        ArrayList<Integer> list=new ArrayList<>();
        int min=0,max=0;

        for(int i=0,j=candies.length-1;i<N && j>=0;i++,j--  ) {
            min+=candies[i];
            N=N-K;
        }

        int index=0;
        for(int j=candies.length-1;j>=index;j--  ) {
            max+=candies[j];
            index=index+K;

        }
        list.add(min);
        list.add(max);
        System.out.println(list);
        }
        public static void quickSort(long[] array, int lower, int upper){
            if(lower<upper){
                int location=partition(array, lower, upper);
                quickSort(array,lower,location-1);
                quickSort(array,location+1,upper);
            }
        }
        public static int partition(long[] array, int lower, int upper){
            long pivot=array[lower];
            int start=lower;
            int end=upper;
            while(start<end){
                while( start<=upper && array[start]<=pivot ){
                    start++;
                }
                while(end>=lower && array[end]>pivot){
                    end--;
                }
                if(start<end){
                    swap(array,start,end);
                }
            }
            swap(array,lower,end);
            return end;
        }
        public static void swap(long[] array,int start, int end){
            long temp=array[start];
            array[start]=array[end];
            array[end]=temp;
        }
    }

