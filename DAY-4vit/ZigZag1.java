//zig-zag1
import java.util.*;
public class ZigZag1
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
	     for(int i=0;i<a.length;i++){
	         if(i%2==0){
	             for(int j=0;j<a[i].length;j++){
	                  System.out.print(a[i][j] + " ");
	             }
	         }
	         else{
	             for(int k=a[i].length-1;k>=0;k--){
	                  System.out.print(a[i][k] + " ");
	           }
	         }
	         
	     }
	     
	  
	  
	}
}
