import java.util.*;

public class InfixToPostfix {
    public static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter infix expression:");
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        String ans = "";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isLetterOrDigit(c)) {
                ans += c;
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans += st.pop();
                }
                if (!st.isEmpty() && st.peek() != '(') {
                    return; // invalid expression
                } else {
                    st.pop();
                }
            } else {
                while (!st.isEmpty() && precedence(c) <= precedence(st.peek())) {
                    ans += st.pop();
                }
                st.push(c);
            }
        }

        // Pop all the operators from the stack
        while (!st.isEmpty()) {
            ans += st.pop();
        }

        System.out.println("Postfix expression: " + ans);
    }
}
