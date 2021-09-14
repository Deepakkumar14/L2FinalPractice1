package Arrays;

public class MinDifferencePair {
    public static void main(String[] args) {
        int[] array={3, 10, 8, 6};
        int diff1=Integer.MAX_VALUE;
        int first=0;
        int second=0;
        for(int i=0;i< array.length;i++){
            for (int j=i+1;j<array.length;j++){
                int diff=array[i]-array[j];
                if(Math.abs(diff)<diff1){
                   first=array[i];
                   second=array[j];
                    diff1=Math.abs(diff);
                }
            }
        }
        System.out.println(first+"-"+second);
        System.out.println(diff1);
    }
}
