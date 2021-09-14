package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountPairs {
    public static void main(String[] args) {
        int[] array={ 1, 5, 7, -1, 5 };
        int target=6;
            Map<Integer,Integer> map = new HashMap<>();
            int count = 0;
            for(int i  = 0;i<array.length;i++){
                int complement = target-array[i];
                if(map.get(complement) != null){
                    count = count + map.get(complement);
                }
                map.put(array[i],map.getOrDefault(array[i],0)+1);
            }
            System.out.println(map);
        }
    }


