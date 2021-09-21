package Mathematical;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class UglyNumber {
    public static void main(String[] args) {
        int n=15;
        int count=1;
        int i=2;
        ArrayList list=new ArrayList();
        list.add(1);

        for(int j=2;j<=n;j++){
            ArrayList factors=new ArrayList();
            for (int k= 1; k <= j; ++k) {
                if (j % k== 0) {
                    if(k%2!=0)

                }
            }
        }

        while(count!=n){
            if(i%2==0 || i%3==0 || i%5==0 ) {
                list.add(i);
                count++;
            }
            i++;
        }
        System.out.println(list);
    }
}
