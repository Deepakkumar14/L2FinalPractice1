package Mathematical;

public class Worker {
    public static void main(String[] args) {
        int[] array={1000,1130,1130,1400,1000,1300,1400,1600};
        int min=1130;
        int max=1400;
        int worker=1;
        for(int i=2;i<array.length-1;i+=2){
            if(array[i]>min && array[i+1]<=max){
                worker++;
            }
            if(array[i]<min && array[i+1]<max)
                worker++;

        }
        System.out.println(worker);
    }
}
