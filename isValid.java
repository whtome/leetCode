package bit.com;

import java.util.Stack;


public class isValid {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
                stack.push(ch[i]);
            }else {
                if (stack.isEmpty()) {
                    return false;
                }
                else if (ch[i] == ')') {
                    if ('(' == stack.peek()) {
                        stack.pop();
                        continue;
                    }else {
                        return false;
                    }
                }
                else if (ch[i] == '}') {
                    if ('{' == stack.peek()) {
                        stack.pop();
                        continue;
                    }else {
                        return false;
                    }
                }else if (ch[i] == ']') {
                    if ('[' == stack.peek()) {
                        stack.pop();
                        continue;
                    }else {
                        return false;
                    }
                }
            }
        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
