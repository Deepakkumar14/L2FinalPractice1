package Arrays;

public class MaxContiguousArray {
    public static void main(String[] args) {
        int[] array={-1,2,3,-2,-5,10,-4,12,-3};
        int max=array[0];
        int startIndex=0,endIndex=0;
        int sum=0;
        for(int i=0;i< array.length;i++){
            sum+=array[i];

              if(sum>max) {
                  max = sum;
                  startIndex++;
                  endIndex=i;
              }

            if(sum<0) {
                sum = 0;
                startIndex++;
            }
        }
        System.out.println(max);
        System.out.println(startIndex);
        System.out.println(endIndex);
    }
}
