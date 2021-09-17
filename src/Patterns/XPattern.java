package Patterns;

public class XPattern {
    public static void main(String[] args) {
            String input="PROGRAM";
            int k=input.length()-1;
            for(int i=0;i<input.length();i++){
                for(int j=0;j<input.length();j++){
                    if(i==j)
                        System.out.print(input.charAt(i));

                    else if(j==k)
                        System.out.print(input.charAt(j));

                    else
                        System.out.print(" ");

                }
                System.out.println();
                k--;
            }
    }
}
