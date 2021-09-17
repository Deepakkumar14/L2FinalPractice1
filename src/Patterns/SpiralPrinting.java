package Patterns;


public class SpiralPrinting {
    public static void main(String[] args) {
        int row=5;
        int col=5;
        int top=0;
        int bottom=row-1;
        int right=col-1;
        int left=0;
        int val=1;
        int[][] output=new int[row][col];

        while(top<=bottom && left<=right) {

            for (int i = left; i <= right; i++) {
                output[top][i]=val;
                val++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                output[i][right]=val;
                val++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                output[bottom][i]=val;
                val++;
            }
            bottom--;

            for (int i = bottom;i>=top;i--){
                output[i][left]=val;
                val++;
            }
            left++;
        }

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(output[i][j]<10)
                System.out.print(output[i][j]+"  ");
                else
                    System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }


    }
}
