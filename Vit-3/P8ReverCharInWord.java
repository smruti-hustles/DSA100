import java.util.*;
public class P8ReverCharInWord
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String[] p=s.split(" ");
	    char ch1;
	    
	    for(int i=0;i<p.length;i++){
	        String x=p[i];
	        char ch;
	        String z="";
	        String s1="",s2="";
	        
	        for(int j=x.length()-1;j>=0;j--){
	            ch=x.charAt(j);
	            z=z+ch;
	            }
	          s1=z; 
	          
	       for(int k=0;k<s1.length();k++){
	           ch1=s1.charAt(k);
	           s2=s2+ch1;
	           }
	           
	      System.out.print(s2+" ");
	   }
	   
	}
}
