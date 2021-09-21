package Mathematical;

public class OddFactorial {
    public static void main(String[] args) {
        int count = 0;
        int N=10;
        for (int i = 1; i <= N; ++i) {
            int factor = 0;
            for (int j = 1; j <= i; ++j) {
                if (i % j == 0) {
                    factor++;
                }
            }
            if ((factor % 2) != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
