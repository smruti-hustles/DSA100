import java.util.*;
abstract class Marks
{
    abstract double getPercentage();
}
class A extends Marks
{   int m1,m2,m3;
   
    A(int m1,int m2,int m3){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    
    public double getPercentage(){
        int s1=m1+m2+m3;
         return ((double) s1 / 300) * 100;
    }
    
}
class B extends Marks
{    int m1,m2,m3,m4;
  
    B(int m1,int m2,int m3,int m4){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        
    }
    
    public double getPercentage(){
         int s2=m1+m2+m3+m4;
         return ((double) s2 / 400) * 100;
       
    }
    
}
public class Percentage
{   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr A's marks");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println("Enetr B's marks");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        int s=sc.nextInt();
        A o1=new A(x,y,z);
        B o2=new B(p,q,r,s);
        double perA=o1.getPercentage();
        double perB=o2.getPercentage();
         System.out.format("Percentage of B is = %.2f", perA);
         System.out.format("\nPercentage of B is = %.2f",perB);
        
    }
}