package Patterns;

public class TrianglePattern {
    public static void main(String[] args) {
        int rows=8;
        for(int i=1;i<=rows;i++){
            for (int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
                for (int k=0;k<2*i-1;k++) {
                    if (k == 0 || k==(2*i-1)-1|| i==rows)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

