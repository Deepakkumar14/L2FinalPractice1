package array2D;

import java.util.ArrayList;

public class Rotation45Degree {
    public static void main(String[] args) {
        int row=4;
        int col=4;
        int[][] array1={{1,2,3,4},{5,6,7,8},{9,1,2,3},{4,5,6,7}};
        int ctr=0;
        while(ctr < 2 * row - 1) {
            for(int i = 0; i <Math.abs( row-ctr- 1); i++)
            {
                System.out.print(" ");
            }

            ArrayList<Integer> list= new ArrayList<>();
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i + j == ctr) {
                        list.add(array1[i][j]);
                    }
                }
            }
            for(int i = list.size() - 1; i >= 0; i--)
            {
                System.out.print(list.get(i) + " ");
            }

            System.out.println();
            ctr++;
        }
    }
}