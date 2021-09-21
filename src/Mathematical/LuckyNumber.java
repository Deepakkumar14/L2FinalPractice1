package Mathematical;

import java.util.ArrayList;

public class LuckyNumber {
    public static void main(String[] args) {
        int n=19;
        ArrayList<Integer> array=new ArrayList<>();
        for(int i=1;i<=n;i++){
            array.add(i);
        }

        int j=1;
        for(int i=0;i<n;i++){
            int k=j;
            ArrayList<Integer> temp=new ArrayList<>();
            System.out.println(array+"hghyft");
            while(k< array.size()){

                temp.add(array.get(k));
                k=k+2;
            }
            System.out.println(temp);
            array.removeAll(temp);
            System.out.println(array);
            j++;
        }

            if(array.contains(n))
                System.out.println("Lucky number");
            else
                System.out.println("Not lucky");
    }


}
