package strings;

import java.util.Stack;

public class StringEncoder {
    public static void main(String[] args) {
        String input = "3[a2[bc]]";
        Stack<String> stack = new Stack<>();
        int n = input.length();
        for(int i = n-1;i>=0;i--){
            char c = input.charAt(i);
            if(c!='['){ // if current char is not an opening bracket then push it into the stack.
                stack.push(String.valueOf(c));
            }
            else if(c == '['){
                StringBuilder currentString = new StringBuilder();
                System.out.println(stack);
                while(!stack.isEmpty() && !stack.peek().equals("]")) { // pop all the strings and keep appending until you get a closing bracket.
                    currentString.append(stack.pop());
                }
                if(!stack.isEmpty()) // pop the closing bracket
                    stack.pop();
                i--; // move to previous positon as from here repetiton number will start
                StringBuilder number = new StringBuilder();
                while(i>=0 && Character.isDigit(input.charAt(i))){
                    System.out.println(number);//create the digit
                    number.insert(0,input.charAt(i));
                    System.out.println(number);
                    i--;
                }
                int repeat = Integer.valueOf(number.toString());
                StringBuilder rep = new StringBuilder();
                for(int j = 1;j<=repeat;j++)
                    rep.append(currentString);
                currentString = rep;
                stack.push(currentString.toString()); // push string result into stack.
                i++;
            }
        }
        String result = "";
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        System.out.println(result);
        }
}
