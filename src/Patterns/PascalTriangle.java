package Patterns;

public class PascalTriangle {
    public static void main(String[] args) {
        int rows=5;
        int value=1;
        for(int i=0;i<rows;i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {

                if (k == 0 || i == k)
                    value = 1;
                else
                    value = value * (i - k + 1) / k;

                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}


