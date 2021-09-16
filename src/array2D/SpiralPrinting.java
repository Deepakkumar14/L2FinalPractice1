package array2D;

public class SpiralPrinting {
    public static void main(String[] args) {
        int[][] array1={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int row=4;
        int col=4;
        int top=0;
        int bottom=row-1;
        int right=col-1;
        int left=0;

        while(top<=bottom && left<=right) {

            for (int i = left; i <= bottom; i++) {
                System.out.print(array1[top][i]+" ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(array1[i][right]+" ");
            }
            right--;

            for (int i = right; i >= left; i--) {
                System.out.print(array1[bottom][i]+" ");
            }
            bottom--;

            for (int i = bottom;i>=top;i--){
                System.out.print(array1[i][left]+" ");
            }
            left++;
        }

    }
}
