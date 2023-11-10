import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[]args){
        String str = "{[()]}]";
            paranthsis(str);
    }
    public static boolean paranthsis(String str) {
        int n = str.length();
        Stack<Character> stack = new Stack<>();
        if (n % 2 != 0) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                return false;
            }

            if (ch == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        if (stack.size() == 0) {
            return true;
        } {return false;}
    }

}
