package arrays;

import java.util.ArrayList;

public class PascalArray {
    public static void main(String[] args) {
         int row=6;
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();

        for(int i=0;i<row;i++){
            ArrayList<Integer> inner=new ArrayList<>();
            if(i==0) {
                inner.add(1);
            }
            else {
                ArrayList<Integer> temp = outer.get(i - 1);
                int k=0;
                for (int j = 0; j <= i; j++) {
                    if(j==0 || j==i) {
                        inner.add(1);
                    }
                    else{
                        int val=temp.get(k)+temp.get(j);
                        inner.add(val);
                        k++;
                    }
                }
            }
            outer.add(inner);
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<row-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(outer.get(i).get(k)+" ");
            }
            System.out.println();
        }

        System.out.println(outer);
    }
}
