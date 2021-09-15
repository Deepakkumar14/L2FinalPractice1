package arrays;

import java.util.ArrayList;

import java.util.Collections;

public class Leaders {
    public static void main(String[] args) {
        int[] array={16,17,4,3,5,2};
       ArrayList<Integer> list=leaders(array, array.length);
        System.out.println(list);
    }
    static ArrayList<Integer> leaders(int array[], int n){
        ArrayList<Integer> list=new ArrayList<>();
        int last = array[n-1];
        list.add(last);
        for (int i=n-2; i>=0;i--)
        {
            if (array[i]>=last)
            {
                last=array[i];
                list.add(last);

            }
        }
        Collections.sort(list,Collections.reverseOrder());
        return list;
    }
}
