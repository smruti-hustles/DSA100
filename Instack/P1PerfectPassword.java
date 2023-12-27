import java.util.*;
public class P1PerfectPassword {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char ch;
        int upchar=1,lowchar=1,digit=1,special=1;
        String s=sc.next();
        if(s.length()!=9){
            System.out.println("Not a Valid Password");
        }
        else{
            for(int i=0;i<s.length();i++){
                ch=s.charAt(i);
                if(Character.isUpperCase(ch))
                upchar=1;
                else if(Character.isUpperCase(ch))
                lowchar=1;
                else if(Character.isDigit(ch))
                digit=1;
                else
                special=1;
            }
            if(upchar==1 && lowchar==1 && digit==1 && special==1){
                 System.out.println("Perfect Password");
            }
            else{
                 System.out.println("Not a Perfect Password");
            }
        }
    }
}
