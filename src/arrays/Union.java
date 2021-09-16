package arrays;

public class Union {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={6,7,8};

        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }

        for (int j=0;j< array2.length;j++) {
            int count=0;
            for( int i=0;i<array1.length;i++){
                if(array2[j]!=array1[i]){
                    count++;
                }
            }
            if(count==array1.length){
                System.out.println(array2[j]);
            }
            }
        }
    }

