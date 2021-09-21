package Mathematical;

public class PerfectNumber {
    public static void main(String[] args) {
        long N = 2000;
        int sum = 0;
        for (int i = 1; i <=N/2; ++i) {
                if (N% i == 0) {
                    sum += i;
                }
            }
        System.out.println(sum);
        if (sum==N)
            System.out.println("True");
        else
            System.out.println("false");
    }
}
