package array2D;

public class Maximum1RowTo0 {
    public static void main(String[] args) {
        int row = 4 , col = 4;
        int array[ ][ ] = { {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0} };

        int index=0;
        int max=0;
        for(int i=0;i<row;i++) {
            int count=0;
            for(int j=0;j<col;j++){
                if(array[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                index=i;
            }
        }

        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                if(i==index){
                    array[i][j]=0;
                }
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
