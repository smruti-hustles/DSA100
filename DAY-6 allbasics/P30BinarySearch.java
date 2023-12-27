import java.util.*;
public class P30BinarySearch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int x,l,h,mid;
        System.out.println("enter array element:");
           x=sc.nextInt();
        for(int i=0;i<a.length;i++){
           a[i]=sc.nextInt();
        }
       // System.out.println("enter searched element:");
        //Arrays.sort(a);
        l=0;
        h=a.length-1;
        mid=(l+h)/2;
        while(l<=h){
            if(a[mid]==x)
              System.out.println("element is present at index"+mid);
            else if(a[mid]>x)  
              h=mid-1;
            else if(a[mid]<x) 
            l=mid+1;
            else
            System.out.println("match not found");
        }
       
    }

}
