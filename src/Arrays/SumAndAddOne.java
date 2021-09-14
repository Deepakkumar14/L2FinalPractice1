package Arrays;

import java.util.Arrays;

public class SumAndAddOne {
    public static void main(String[] args) {
        int[] array={9};

        int sum=0,count=0;
        for(int i=0;i< array.length;i++) {
            sum = (sum* 10)+array[i];
            count++;
        }
        sum=sum+1;
        if(sum%10==0){
            count++;
        }
        int[] output=new int[count];
        System.out.println(Arrays.toString(output));
        int i=output.length-1;
        while(sum>0){
            int rem=sum%10;
            output[i]=rem;
            sum=sum/10;
            i--;
        }
        System.out.println(Arrays.toString(output));
    }
}
