package arrays;

public class GoodPairs {
    public static void main(String[] args) {
        int[] array={1,2,3,1,1,3};
        int count=0;
        for(int i=0;i< array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.println(i +"+"+j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
