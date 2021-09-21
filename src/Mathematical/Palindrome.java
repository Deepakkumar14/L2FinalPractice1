package Mathematical;

public class Palindrome {
    public static void main(String[] args) {
        int N=17;
        String s="";
        while(N>0){
            int rem=N%2;
            s+=rem;
            N=N/2;
        }

        for (int i = 0; i < s.length()/ 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {

            }
        }
    }
}
