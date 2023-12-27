
import java.util.*;
public class P11FrequecyOfEachCharacterInAString {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] c=new int[str.length()];
        char[] s=str.toCharArray();
        for(int i=0;i<str.length();i++){
            c[i]=1;
            for(int j=i+1;j<str.length();j++){
                if(s[i]==s[j]){
                    c[i]++;
                    s[j]='0';
                }
            }
        }
        for(int i=0;i<str.length();i++){
            if(s[i]!='0' && s[i]!=' ')
             System.out.println(s[i] + "-" + c[i]);  
             
        }
    }
}
