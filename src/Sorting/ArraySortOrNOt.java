package Sorting;

public class ArraySortOrNOt {
    public static void main(String[] args) {
        int[] array={90, 80, 100, 70, 40, 30};
        boolean bool=new ArraySortOrNOt().arraySortedOrNot(array);
        if (bool)
            System.out.println("Sorted");
        else
            System.out.println("not sorted");
    }
    boolean arraySortedOrNot(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]<0){
                return false;
            }
        }

        return true;
    }
}
