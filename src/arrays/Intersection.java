package arrays;

public class Intersection {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={3,2,1};

        for (int j=0;j< array2.length;j++) {
            for( int i=0;i<array1.length;i++){
                if(array2[j]==array1[i])
                    System.out.println(array2[j]);
            }
        }

    }
}
