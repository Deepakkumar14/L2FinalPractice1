package Mathematical;

import java.util.Arrays;

public class CircularTour {
    public static void main(String[] args) {
        int[] array={1 ,6 ,6 ,5 ,7 ,3 ,4 ,5};
        int[] Petrol = new int[13];
        int[] Distance = new int[13];
        int l=0,m=0;
        for(int i=0;i< array.length;i++){
            if(i%2==0) {
                Petrol[l] = array[i];
                l++;
            }
            else{
                Distance[m]=array[i];
                m++;
            }
        }
        System.out.println(Arrays.toString(Petrol));
        System.out.println(Arrays.toString(Distance));

       int startPoint=-1;
       int j=0;
       int k=0;
       int remainingPetrol=0;
       for(int i=0;i<Petrol.length;i++){
           int initialPetrol=Petrol[i]+remainingPetrol;
           if(i==startPoint)
               break;
           if (initialPetrol-Distance[i]>=0){
               if(j==0) {
                   startPoint = i;
                   j++;
               }
               remainingPetrol=initialPetrol-Distance[i];
           }
           else{
               if(i<= Petrol.length-1) {
                  startPoint=-1;
           }
               if(k==1){
                   startPoint=-1;
                   break;
               }

               j=0;
           }
           if(i== Petrol.length-1) {
               i = -1;
               k++;
           }
       }

       if(startPoint==-1)
           System.out.println("-1");
       else
        System.out.println(startPoint);
    }
}
