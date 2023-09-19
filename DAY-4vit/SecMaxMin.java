import java.util.*;
public class SecMaxMin
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<a.length;i++){
	       
	            a[i]=sc.nextInt();
	      
	    }
	    Arrays.sort(a);
		System.out.println("2nd Max element = "+a[a.length-2]);
		System.out.println("2nd min element = "+a[1]);
	}
}
