package arrays;

public class FindExtraElement {
    public static void main(String[] args) {
     int    A[] = {3,5,7,9,11,13};
        int B[] = {3,5,7,11,13};
        for (int i=0;i<A.length;i++){
            if (A[i]!=B[i]){
                System.out.println("The missing element is "+A[i]);
                System.out.println("Index  "+i);
                break;
            }
        }
    }
}
