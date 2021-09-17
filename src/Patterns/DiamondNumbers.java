package Patterns;

public class DiamondNumbers {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            int value=i,count=0;
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print(value);
                    if(value>1 && count==0){
                        value--;
                    }
                    else {
                        count++;
                        value++;
                    }
                }
            System.out.println();
            }

        for(int i=rows-1;i>=0;i--){
            int value=i,count=0;
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print(value);
                if(value>1 && count==0){
                    value--;
                }
                else {
                    count++;
                    value++;
                }
            }
            System.out.println();
        }

        }
    }

