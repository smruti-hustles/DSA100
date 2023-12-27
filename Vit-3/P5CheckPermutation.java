//program5
import java.util.*;
public class P5CheckPermutation
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    String s2=sc.nextLine();
	    int l1=s1.length();
	    int l2=s2.length();
	    if(l1!=l2){
	        System.out.print("Not Permutation of each other");
	    }
	    else{
	        char[] a1=s1.toCharArray();
	        char[] a2=s2.toCharArray();
	        Arrays.sort(a1);
	        Arrays.sort(a2);
	        
	        if(Arrays.equals(a1,a2)){
	            System.out.print("Permutation of each other");
	        }
	        else{
	            System.out.print("Not Permutation of each other");
	        }
	    }
	}
}	
