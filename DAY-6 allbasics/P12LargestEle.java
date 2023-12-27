import java.util.*;
public class P12LargestEle{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
       /* Arrays.sort(a);
        System.out.println("largest ele is " + a[a.length-1]);
         System.out.println("largest ele is " + a[0]);
         */
         int max=a[0];
         int min=a[a.length-1];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            else if(a[i]<min){
                min=a[i];
            }
        }
         System.out.println("largest ele is " + max);
         System.out.println("largest ele is " + min);
      }
    }
