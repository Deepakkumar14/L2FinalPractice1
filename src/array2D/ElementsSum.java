package array2D;

public class ElementsSum {
    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        int row=3;
        int col=3;
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum+= array[i][j];
            }
        }
        System.out.println(sum);
    }
}
