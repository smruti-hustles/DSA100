import java.util.*;
public class P28ArraysSort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[7];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
        }
    }
}