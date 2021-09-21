package Mathematical;

public class BalancedNumber {
    public static void main(String[] args) {
        String N="12432";
        int left=0;int right=0;
        for(int i=0;i<N.length()/2;i++){
            left+=(N.charAt(i)-48);
        }
        if(N.length()%2==0)
        for(int i=N.length()/2;i<N.length();i++){
            right+=(N.charAt(i)-48);
        }
        else
            for(int i=N.length()/2+1;i<N.length();i++){
                right+=(N.charAt(i)-48);
            }

        System.out.println(left);
        System.out.println(right);
        if(right==left)
            System.out.println("1");
        else
            System.out.println("0");


    }
}
