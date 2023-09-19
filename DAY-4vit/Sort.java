//assignment 6
//SORT 0 1
import java.util.*;
public class Sort
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   //System.out.println("enter number of test case");
   int t=sc.nextInt();
   for(int k=0;k<t;k++){
       // System.out.println("enter size of array "+(k+1));
           int n=sc.nextInt();
           int a[]=new int[n];
          // System.out.println("enter array elements (either 0 or 1 )");
           for(int i=0;i<a.length;i++){
               a[i]=sc.nextInt();
            }
        
            Arrays.sort(a);
           // System.out.println((k+1)+" Array elements are");
            for(int i=0;i<a.length;i++){
                 System.out.print(a[i] + " ");
               }

             }
        }
   }