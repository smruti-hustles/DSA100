//Assignment - 2
//Find Duplicate
import java.util.*;
public class Duplicate
{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("enter number of test case");
         int t=sc.nextInt();
         for(int k=0;k<t;k++){
        // System.out.println("enter size of array "+(k+1));
          int n=sc.nextInt();
          int a[]=new int[n];
          // System.out.println("enter array elements");
          for(int i=0;i<a.length;i++){
               a[i]=sc.nextInt();
           }
        
          Arrays.sort(a);
           // System.out.println("Finding duplicate element in the array");
            for(int i=0;i<a.length-1;i++){
                if(a[i]==a[i+1])
                 System.out.print(a[i] + " ");
               }
        System.out.println("\n*********************");
             }
        }
   }