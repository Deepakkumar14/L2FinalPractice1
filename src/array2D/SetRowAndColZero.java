package array2D;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetRowAndColZero {
    public static void main(String[] args) {
        int[][] array = {{1, 1, 0}, {1, 0, 1}, {1, 1, 1}};
        int row = 3;
        int col = 3;
//        int[][] output = new int[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if (array[i][j] == 0) {
//                    int m = row - 1, n = col - 1;
//                    while (n >= 0 && m >= 0) {
//                        output[i][n] = 99;
//                        output[m][j] = 99;
//                        m--;
//                        n--;
//                    }
//                }
//                if (output[i][j] != 99)
//                    output[i][j] = array[i][j];
//            }
//        }
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if (output[i][j] == 99)
//                    System.out.print(0 + " ");
//                else
//                    System.out.print(output[i][j] + " ");
//            }
//            System.out.println();
//        }

        ArrayList<Integer> rows = new ArrayList<Integer>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] == 0) {
                    rows.add(i);
                    rows.add(j);
                }
            }
        }

        for(int i=0;i< rows.size();i+=2) {
            int k = rows.get(i);
            for (int j = 0; j < row; j++) {
                array[k][j] = 0;
            }
            k = rows.get(i + 1);
            for (int j = 0; j < col; j++) {
                array[j][k] = 0;
            }
        }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }




