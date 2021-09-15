package arrays;

import java.util.ArrayList;

public class MinDistanceBetweenTwoNum {
    public static void main(String[] args) {
        int[] array={3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        int x=3;
        int y=6;
        int startIndex=0;
        int endIndex=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(x==array[i]){
                startIndex=i;
            }
            else if(y==array[i]){
                endIndex=i;
            }
            if(endIndex!=0 || startIndex!=0)
                list.add(Math.abs(endIndex-startIndex));

        }
        int min=list.get(0);
        for (int i=1;i< list.size();i++){
            if(min>list.get(i)){
                min= list.get(i);
            }
        }
        System.out.println(min);
    }
}
