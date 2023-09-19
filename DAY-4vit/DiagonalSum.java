import java.util.*;
public class DiagonalSum
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	  
	    int n=sc.nextInt();
	    int a[][]=new int[n][n];
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

            int s=0;
            for(int i=0;i<a.length;i++){
	       for(int j=0;j<a[i].length;j++){
	            if(i==j || ((i+j)==(n-1))){
                          s+=a[i][j];
                  }
	       }
	    }
	   
		
		System.out.println("Sum of diagonal = "+s);
	}
}
