package Mathematical;

import java.util.ArrayList;

public class Doors {
    public static void main(String[] args) {
        int N=4;
        ArrayList<Integer> array=new ArrayList<>();
        for(int i=0;i<N;i++){
            array.add(0);
        }
        System.out.println(array);
        for(int i=0;i<N;i++){
            int k=i;
            while(k< array.size()){
                if(array.get(k)==0) {
                    array.remove(k);
                    array.add(k,1);
                }
                else {
                    array.remove(k);
                    array.add(k,0);
                }
                k+=1+i;
            }
        }
        int count =0;
        for(int i=0;i<array.size();i++){
            if(array.get(i)==1){
                count++;
            }
        }
        //Alter
         int val= (int) Math.sqrt(N);
        System.out.println(count);
    }
}
