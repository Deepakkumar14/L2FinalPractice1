package Mathematical;

public class IsSquare {
    public static void main(String[] args) {
        int x1=482,y1=482,x2=-482,y2=-482,x3=482,y3=-482,x4=-482,y4=482;
        int a=Math.abs((x3-x1));
        int b=Math.abs((y3-y1));
        int c=Math.abs((x2-x4));
        int d=Math.abs((y2-y4));

        if(x1==x3 && y1==y3 && y2==y4 && x2==x4)
            System.out.println( "No");

        if(a==c && b==d ){
            System.out.println( "Yes");
        }
        else
            System.out.println( "No");

    }
}
