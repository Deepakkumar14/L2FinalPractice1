package array2D;

import java.util.ArrayList;

public class ExchangeablePairsRectangle {
    public static void main(String[] args) {
        int[][] output={{4,8},{3,6},{10,20},{15,30}};
        int rows=4;
        int col=2;
        int count=0;
        ArrayList list=new ArrayList<>();
        for(int i=0;i<rows;i++){
            list.add((double) output[i][0]/output[i][1]);
            }

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).equals(list.get(j)))
                    count++;
            }
        }

        System.out.println(count);
    }
}

