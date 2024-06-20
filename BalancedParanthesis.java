import java.util.*;
public class BalancedParanthesis{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else if(c==')' || c=='}' || c==']'){
                if(st.isEmpty()){
                    System.out.println("Unbalanced");
                    return;
                }
                char top=st.pop();
                if((c==')' && top!='(') || (c=='}' && top!='{') || (c==']' && top!='[')){
                System.out.println("Unbalanced");
                return;
                }
            }
        }
        if(st.isEmpty())
        System.out.println("Balanced paranthesis");
        else
        System.out.println("UnBalanced");
    }
}