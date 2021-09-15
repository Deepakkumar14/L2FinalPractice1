package arrays;

public class BalancedArray {
    public static void main(String[] args) {
        int[] array={1, 2, 1, 2, 1, 3};
        int sum1=0,sum2=0;
        for(int i=0;i<array.length;i++){
            if(i<(array.length/2)){
                sum1+=array[i];
            }
            else {
                sum2 += array[i];
            }
        }
        int diff=sum1-sum2;
        System.out.println("To make the array balanced you can add "+Math.abs(diff));
    }
}
