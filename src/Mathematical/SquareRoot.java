package Mathematical;

public class SquareRoot {
    public static void main(String[] args) {
            int x=6;
        int counter = 1, sqroot=1, output;
        while (sqroot <= x)
        {
            counter++;
            sqroot = counter*counter;
        }
        output= counter - 1;
        System.out.println( output) ;
    }
}
