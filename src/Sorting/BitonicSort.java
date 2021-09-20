package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BitonicSort {
    public static void main(String[] args) {
        int array[] = { 3,1,2,4,5,9,13,14,12 };
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 ==0) {
                even.add(array[i]);
            }
            else {
                odd.add(array[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());

        int i = 0;
        for (int j = 0; j < even.size(); j++)
            array[i++] = even.get(j);

        for (int j = 0; j < odd.size(); j++)
            array[i++] = odd.get(j);

        System.out.println(Arrays.toString(array));
    }
    }

