package arrays;

public class SumOfContiguousArray {
    public static void main(String[] args) {
        int sum = 12;
        int array[] = {2,10,3,7,5};
        int total=0,startIndex=0,endIndex=0;

        for(int i=0;i< array.length;i++){
            endIndex=i;
            total+=array[i];
            if(total==sum){
                break;
            }
            else if(total>sum){
                startIndex++;
                i=startIndex-1;
                total=0;
            }
        }
        System.out.println(startIndex+1);
        System.out.println(endIndex+1);
    }
}
