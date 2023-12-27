import java.util.*;
public class P462ndlargest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++){
           a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Largest"+ a[a.length-1]);
        System.out.println("smallest"+ a[0]);
        System.out.println("Second Largest"+ a[a.length-2]);
        System.out.println("Second smallest"+ a[1]);
    }
}