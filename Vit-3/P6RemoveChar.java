//program 6
import java.util.*;

public class P6RemoveChar
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String p="";
	    char c=sc.next().charAt(0);
	    for(int i=0;i<s.length();i++){
	        char ch=s.charAt(i);
	        if(c!=ch){
	           p=p+ch; 
	        }
	    }
		System.out.print(p);
	}
}
