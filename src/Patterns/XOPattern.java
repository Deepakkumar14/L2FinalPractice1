package Patterns;

public class XOPattern {
    public static void main(String[] args) {
        int row=8;
        int col=5;
        int top=0;
        int bottom=row-1;
        int right=col-1;
        int left=0;
        char[][] output=new char[row][col];
        char val=0;
        while(top<=bottom && left<=right) {
            if(top%2==0)
                val='X';
            else
                val='O';

            for (int i = left; i <= right; i++) {
                output[top][i]=val;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                output[i][right]=val;
            }
            right--;

            for (int i = right; i >= left; i--) {
                output[bottom][i]=val;
            }
            bottom--;

            for (int i = bottom;i>=top;i--){
                output[i][left]=val;
            }
            left++;

        }

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }

    }
}
