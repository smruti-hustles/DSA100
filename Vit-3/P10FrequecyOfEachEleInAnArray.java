
import java.util.*;
public class P10FrequecyOfEachEleInAnArray
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter how many elemets do you want");
	    int n=sc.nextInt();
	    int[] a=new int[n];
	    System.out.println("enter "+n+" elements");
	    for(int i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	    }
	    System.out.println("Array elemts are:");
	     for(int i=0;i<a.length;i++){
	     System.out.print(a[i]+" ");
	    }
	   
	   int[] b=new int[a.length];
	   int visited=-1;
	   for(int i=0;i<a.length;i++){
	       int c=1;
	       for(int j=i+1;j<a.length;j++){
	           if(a[i]==a[j]){
	           c=c+1;
	           b[j]=visited;
	           }
	       }
	       if(b[i]!=visited)
	       b[i]=c;
	   
	   }
	   System.out.println("array elemets with their frequencies");
	   for(int i=0;i<b.length;i++){
	       if(b[i]!=visited)
		System.out.println(a[i]+" "+b[i]);
	   }
	   
	}
}
