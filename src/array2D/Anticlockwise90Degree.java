package array2D;

public class Anticlockwise90Degree {
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

        int m=col-1;
        for(int i=0;i<row/2;i++) {
            for (int j = 0; j < col; j++) {
                int temp = array[i][j];
                array[i][j] = array[m][j];
                array[m][j] = temp;
            }
            m--;
        }
        for(int i=0;i<row;i++) {
            for (int j = 0; j< col; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    }


