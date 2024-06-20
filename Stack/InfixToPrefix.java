import java.util.*;

public class InfixToPrefix {
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

        // Reverse the input string using a stack
        Stack<Character> reverseStack = new Stack<>();
        for (char c : s.toCharArray()) {
            reverseStack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!reverseStack.isEmpty()) {
            reversed.append(reverseStack.pop());
        }
        s = reversed.toString();

        // Swap '(' with ')' and vice versa in the reversed string
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                chars[i] = ')';
            } else if (chars[i] == ')') {
                chars[i] = '(';
            }
        }
        s = new String(chars);

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
            } else { // if it is an operator
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

        // Reverse the result using a stack to get the prefix expression
        Stack<Character> resultStack = new Stack<>();
        for (char c : ans.toCharArray()) {
            resultStack.push(c);
        }
        StringBuilder finalResult = new StringBuilder();
        while (!resultStack.isEmpty()) {
            finalResult.append(resultStack.pop());
        }

        System.out.println("Prefix expression: " + finalResult.toString());
    }
}
