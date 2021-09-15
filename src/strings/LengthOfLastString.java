package strings;



public class LengthOfLastString {
    public static void main(String[] args) {
        String s="fly to the moon      and       shine    ";
       int count=0;
       for(int i=s.length()-1;i>=0;i--) {
           if (s.charAt(i) != ' ') {
               count++;
               if(s.charAt(i-1)==' ')
                   break;
           }


       }
        System.out.println(count);

    }
}
