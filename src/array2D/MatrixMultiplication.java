package array2D;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int row=3;
        int col=3;
        int col2=2;
        int row2=3;
        int[][] array1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2={{1,2},{4,5},{1,1}};
        int[][] output=new int[row][col2];
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col2; j++) {
                output[i][j] = 0;
                for (int k = 0; k <row2; k++) {
                    output[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        for(int i=0;i<row;i++) {
            for (int j = 0; j< col2; j++) {
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }

    }
}
