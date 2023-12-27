import java.util.*;
public class P29LinearSer{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
          System.out.print("enter ele to be searched: ");
           int x=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                System.out.println(x+" is found at index " + i);
            }
            
        }
         
      }
    }
