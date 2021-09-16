package array2D;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] array={ {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0} };
        int row=4;
        int col=4;
        int count=0;
        for(int i=0;i<row;i++) {
            for (int j = 0; j< col; j++) {
                if (array[i][j]!=0){
                    break;
                }
                else
                    count++;
            }
            if(count==col){
                System.out.println(i+ "  is celebrity");
            }
            count=0;
            }
    }
}
