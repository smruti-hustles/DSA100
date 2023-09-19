import java.util.*;
public class HighestSumRow
{
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	      int m=sc.nextInt();
	      int n=sc.nextInt();
	    int a[][]=new int[m][n];
	    for(int i=0;i<a.length;i++){
	         for(int j=0;j<a[i].length;j++){
	            a[i][j]=sc.nextInt();
	       }
	    }
	    for(int i=0;i<a.length;i++){
	         for(int j=0;j<a[i].length;j++){
	            System.out.print(a[i][j] + " "); 
	       }
	        System.out.println();
	    }
	    
	     ArrayList<Integer> x = new ArrayList<>();
	    
	    for(int i=0;i<a.length;i++){
	      
	            int s1=0;
	            for(int j=0;j<a[i].length;j++){
	                s1+=a[i][j];
	            }
	             x.add(s1);
	            System.out.println(s1);
	     
	    }
	  
	   int max = x.get(x.size() - 1);
	 System.out.println(max);
	}
}
