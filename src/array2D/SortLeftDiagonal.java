package array2D;

public class SortLeftDiagonal {
    public static void main(String[] args) {
     int[][] array={{5, 2, 0 ,7 ,1}, {3 ,4 ,2 ,9 ,14}, { 5 ,1 ,3 ,5 ,2}, { 4 ,2 ,6 ,2 ,1}, {0 ,6, 3 ,5 ,1}} ;
     int row=5;
     int col=5;
     int[] diagonal=new int[row];
        for (int i = 0; i < row; i++) {
                    diagonal[i]=array[i][i];
        }

        for(int i=0;i<diagonal.length;i++){
            for(int j=i+1;j<diagonal.length;j++){
                if(diagonal[i]>diagonal[j]){
                    int temp=diagonal[i];
                    diagonal[i]=diagonal[j];
                    diagonal[j]=temp;
                }
            }
        }

        for (int i = 0; i < row; i++) {
                    array[i][i]=diagonal[i];
            }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    }

