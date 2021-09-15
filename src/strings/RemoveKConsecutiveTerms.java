package strings;

public class RemoveKConsecutiveTerms {
    public static void main(String[] args) {
        String input="geegsforgeeks";
        int k=2;
        String temp=input;
        String output="";
        for(int i=0;i<input.length();i++){
            int count=1;
            for(int j=i+1;j<temp.length();j++){
            if(temp.charAt(i)==temp.charAt(j)){
                count++;
                int StartIndex=i;int m=i+1;
                int endIndex=j;
                j++;
                while(j<temp.length()&&(temp.charAt(m)==temp.charAt(j))){
                    m++;
                    j++;
                    count++;
                    endIndex++;
                }
                if(count==k){
                    output=temp;
                    temp="";
                    for(int l=0;l<output.length();l++){
                        if(!(l>=StartIndex && l<=endIndex)) {
                            temp += output.charAt(l);
                        }
                    }
                    i=-1;
                    break;
                }
            }
            break;
        }
    }
        System.out.println(temp);
    }
}
