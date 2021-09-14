package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] array={3,1,3,3,2};
        int target=array.length/2;
        int count=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                int value=map.get(array[i]);
                map.put(array[i],++value);
            }
            else
            map.put(array[i],count);
        }
        for (Map.Entry<Integer,Integer> value: map.entrySet()) {
            if(value.getValue()>=target)
                System.out.println(value.getKey());
        }
    }
}
