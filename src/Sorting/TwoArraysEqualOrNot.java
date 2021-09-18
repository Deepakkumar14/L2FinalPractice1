package Sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoArraysEqualOrNot {
    public static void main(String[] args) {
       long  array1[] = {1,2,5,4,0};
        long array2[] = {2,4,5,0,1};
        int count=0;
        Map<Long,Long> map=new HashMap();
       // ArrayList<Integer> list=new ArrayList();

        for(int i=0;i<array1.length;i++){
            if(map.containsKey(array1[i])){
               long val=map.get(array1[i]);
                map.put(array1[i],val+1);
            }
            else
                map.put(array1[i],1l);
        }

        System.out.println(map);

        for(int i=0;i<array2.length;i++){
            if(!map.containsKey(array2[i])){
                count = 1;
                break;
            }

            if (map.get(array2[i])==0) {
                count = 1;
                break;
            }

            long val=map.get(array2[i]);
            map.put(array2[i],val-1);

        }

        if (count==1)
            System.out.println("Not same");
        else
            System.out.println("same");

    }
}
