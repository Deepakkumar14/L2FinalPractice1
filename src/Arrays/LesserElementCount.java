package Arrays;

import java.util.Arrays;

public class LesserElementCount {
    public static void main(String[] args) {
        int[] array={8,1,2,2,3};
       int[] count= new LesserElementCount().smallerNumbersThanCurrent(array);
        System.out.println(Arrays.toString(count));
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts=new int[nums.length];
        int count=0;
        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            counts[i]=count;
            count=0;
        }
        return counts;
    }
}
