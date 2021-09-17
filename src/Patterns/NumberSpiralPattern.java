package Patterns;

public class NumberSpiralPattern {
    public static void main(String[] args) {
        int number=4;
        int row=number*2-1;
        int col=number*2-1;
        int top=0;
        int bottom=row-1;
        int right=col-1;
        int left=0;
        int[][] output=new int[row][col];

        while(top<=bottom && left<=right) {

            for (int i = left; i <= right; i++) {
                output[top][i]=number;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                output[i][right]=number;
            }
            right--;

            for (int i = right; i >= left; i--) {
                output[bottom][i]=number;
            }
            bottom--;

            for (int i = bottom;i>=top;i--){
                output[i][left]=number;
            }
            left++;

            number--;
        }

        for (int i=0;i<output.length;i++){
            for (int j=0;j<output.length;j++){
                    System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }


    }
}
