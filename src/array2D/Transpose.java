package array2D;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] array={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int row=4;
        int col=4;
        for(int i=0;i<row;i++) {
            for (int j = i+1; j< col; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        for(int i=0;i<row;i++) {
            for (int j = 0; j< col; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}

//flip the for loop or just flip array[i][j] in sout to array[j][i]
