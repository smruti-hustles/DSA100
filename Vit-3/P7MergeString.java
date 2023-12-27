
//program 7
import java.util.*;
public class P7MergeString
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    String s2=sc.nextLine();
	    int l1=s1.length();
	    int l2=s2.length();
	    int min;
	    char c1,c2;
	    String s="";
	    
	    if(l1<l2){
	       for(int i=0;i<l1;i++){
	       c1=s1.charAt(i);
	       c2=s2.charAt(i);
	       s=s+c1+c2;
	    } 
	    s=s+s2.substring(l1);
	    }
	    
	    else{
	       for(int i=0;i<l2;i++){
	       c1=s1.charAt(i);
	       c2=s2.charAt(i);
	       s=s+c1+c2;
	    } 
	    s=s+s1.substring(l2);
	    }
	   
	    
	    System.out.print(s);
	   
	}
}
