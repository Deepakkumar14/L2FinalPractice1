package array2D;

public class LeftRightRotateCompare {
    public static void main(String[] args) {
        int row = 2, col = 4;
       int[][] array= {{1,2,1,3}, {2, 1, 2, 1}};
        int x = 2;
       int[][] output=new int[row][col];
        for(int i=0;i<row;i++) {
            int[] array1 = new int[col];
            for (int j = 0; j < col; j++) {
              array1[j]=array[i][j];
            }
            if(i%2==0){
                for (int m = 0; m < x; m++) {
                    int last =array1 [0];
                    for (int j =1; j <array1.length; j++) {
                        array1[j-1] = array1[j];
                    }
                    array1[array1.length - 1] = last;
                }
            }

            else{
                for (int m = 0; m < x; m++) {
                    int last =array1[array1.length - 1];
                    for (int j = array1.length -2; j >= 0; j--) {
                        array1[j+1] = array1[j];
                    }
                    array1[0] = last;
                }
            }

            for (int j = 0; j< col; j++) {
                output[i][j]=array1[j];
            }
        }

        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(output[i][j]+" ");
                }
            System.out.println();
        }

        boolean bool=true;
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] != output[i][j]) {
                    bool = false;
                    break;
                }
            }
        }

        if (bool)
            System.out.println("Same matrix");
        else
            System.out.println("Different matrix");

    }
}
