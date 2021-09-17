package Patterns;

public class Program {
    public static void main(String[] args) {
        String input="ODD";
        char[][] output=new char[input.length()][2];
        int k=0,l=0;
        for (int i=0;i<input.length();i++){
            if (i > input.length() / 2) {
                l = 1;
            }
            output[k][l]=input.charAt(i);
            k++;
        }

        k--;
        l=0;
      for (int i=0;i<input.length();i++){
             if(i==input.length() / 2){
                output[k][++l]=' ';
             }
             else {
                 output[k][l] = input.charAt(i);
             }
          k--;
      }

        for (int i=0;i<output.length;i++){
            for (int j=0;j<2;j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}
