import java.util.*;

public class P5reverseWords {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] p=s.split(" ");
        for(int i=p.length-1;i>=0;i--){
               System.out.print(p[i]+" ");
        }
    }
}
