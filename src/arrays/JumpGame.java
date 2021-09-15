package arrays;
//still some cases to be solved ......
public class JumpGame {
    public static void main(String[] args) {
        int[] array={1,1,1,1,1};
        int target= array.length-1;
        int point=0;
        int jump1=0;
        int jump2=0;
            if(array[0]==target){
                jump1++;
            }
            else{
                int temp=array[0];
                int max=temp;
                while( point<target){
                    point=max;

                    if(point<=target){
                        jump1++;

                    }
                    else if(point==target)
                        break;

                    else{
                        point-=max;
                       max=max-1;
                    }
                    max+=array[max];
                }

            }
        System.out.println(jump1);
    }
}
