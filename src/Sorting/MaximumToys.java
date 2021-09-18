package Sorting;

import javax.swing.plaf.IconUIResource;

public class MaximumToys {
    public static void main(String[] args) {
        int array[] = {200,30,50};
        int k=50;
        int count=1;
        int sum=0;
        int index=0;
        for(int i=0;i< array.length;i++){
            if(array[i]<k) {
                sum = array[i];
                index=i;
                break;
            }
        }

        for(int i=0;i< array.length;i++){
            if(i==index)
                continue;

            else if(sum+array[i]<=k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
