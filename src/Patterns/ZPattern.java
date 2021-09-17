package Patterns;

public class ZPattern {
    public static void main(String[] args) {
        int rows=10;
        for(int i=0;i<rows;i++){
            for(int j=1;i!=0 && i!=rows-1 && j<rows-i ;j++){
                System.out.print(" ");
            }
            if(i==0 || i==rows-1){
                for(int k=0;k<rows;k++){
                    System.out.print("*");
                }
            }
            else{
                for(int k=0;k<rows;k++){
                    if(k==(rows-i))
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
