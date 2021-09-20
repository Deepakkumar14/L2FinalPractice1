package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SortByAbsDifference {
    public static void main(String[] args) {
        int[] arr={10,5,3,9,2};
        int k=7;
        TreeMap<Integer, ArrayList<Integer>> map=new TreeMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int diff=Math.abs(arr[i]-k);
            ArrayList<Integer> list=map.getOrDefault(diff,new ArrayList<>());
            list.add(arr[i]);
            map.put(diff,list);
        }
        int index=0;
        for(Map.Entry entry:map.entrySet())
        {
            ArrayList<Integer> list=map.get(entry.getKey());
            for(int j=0;j< list.size();j++)
            {
                arr[index++]=list.get(j);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
