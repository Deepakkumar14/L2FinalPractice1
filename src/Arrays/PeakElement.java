package Arrays;

//A peak element is an element that is strictly greater than its neighbors
public class PeakElement {
    public static void main(String[] args) {
        int[] array={1,2,1,3,5,6,4};
        for(int i=1;i<array.length-1;i++){
            if(i<array.length && array[i]>array[i+1] && array[i]>array[i-1]){
                System.out.println("The peak element is  "+array[i]+ "  the index is  "+ i );
            }
        }
    }
}
