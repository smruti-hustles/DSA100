import java.util.*;

public class P2RemoveVowels {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String p="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' &&  ch!='U'){
                p=p+ch;
            }
        }
        System.out.println(p);
    }
}
