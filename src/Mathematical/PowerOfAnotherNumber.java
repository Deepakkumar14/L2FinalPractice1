package Mathematical;

public class PowerOfAnotherNumber {
    public static void main(String[] args) {
        int a=100;
        int b=1;
        int c=0;
        int j=0;
        while(c!=b && j<=b/2) {
            c = (int) Math.pow(a, j);
            j++;
        }
        if(c==b)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
