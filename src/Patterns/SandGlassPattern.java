package Patterns;

public class SandGlassPattern {
    public static void main(String[] args) {
        int rows=8;
        for(int i=rows-1;i>=0;i--){
            for(int j=1;j<rows-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=0;i<rows;i++){
            for(int j=1;j<rows-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
