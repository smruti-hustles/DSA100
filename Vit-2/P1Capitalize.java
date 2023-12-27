import java.util.*;

public class P1Capitalize {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] p=s.split(" ");
        for(int i=0;i<p.length;i++){
            char ch=p[i].charAt(0);
            String s1=String.valueOf(ch).toUpperCase();
            String s2=p[i].substring(1);
             System.out.print(s1+s2+" ");
        }
    }
}
