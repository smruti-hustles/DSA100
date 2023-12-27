import java.util.*;
public class P6ReverseString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String p="";
        char ch;
        for(int i=s.length()-1;i>=0;i--){
            ch=s.charAt(i);
           p=p+ch;
        }
        System.out.println(p);
    }
}
