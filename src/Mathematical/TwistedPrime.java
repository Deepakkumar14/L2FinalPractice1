package Mathematical;

public class TwistedPrime {
    public static void main(String[] args) {
        int a=10620793;
        int temp = a;
        int reverse=0;
        while (temp != 0) {
            int rem = temp % 10;
            reverse=(reverse*10)+rem;
            temp= temp / 10;
        }
        int point=(int)Math.max(a,reverse);
        boolean bool=true;
        for(int i=2;i<=Math.sqrt(point);i++){
            if(a%i==0) {
                bool=false;
                break;
            }
            if(reverse%i==0) {
                bool=false;
                break;
            }
        }
        if (bool){
            System.out.println("true");
        }
        else
            System.out.println("false");

    }
}
