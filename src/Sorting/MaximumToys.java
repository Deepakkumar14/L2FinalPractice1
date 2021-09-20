package Sorting;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class MaximumToys {
    public static void main(String[] args) {
        int array[] = {20,30,50};
        int k=50;
        int count=0;
        Arrays.sort(array);
        int sum=0;
        for(int i=0;i< array.length;i++){
            if(sum+array[i]<=k) {
                sum=sum+array[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
