import java.util.*;
public class P9frequencyofagivencharacteruserinput {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	    }
	     for(int i=0;i<a.length;i++){
	        System.out.print(a[i]+" ");
	    }
	    System.out.println("Enter the element whose frequency you want to find   :");
	    int b=sc.nextInt();
	    int c=0;
	    for(int i=0;i<a.length;i++){
	        if(a[i]==b)
	        c=c+1;
	    }
		System.out.println("Frequency of "+b+" is : "+c);
	}
}
