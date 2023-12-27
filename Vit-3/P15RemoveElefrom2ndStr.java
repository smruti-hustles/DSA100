import java.util.*;
public class P15RemoveElefrom2ndStr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s="";

        for(int i=0;i<s1.length();i++){
            int v=0;
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j))
                v=1;
            }
            if(v!=1){
                s+=s1.charAt(i);
            }
        }
        System.out.println(s);
    }
}