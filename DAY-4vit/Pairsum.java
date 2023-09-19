//Assignment-4
//Pair sum
import java.util.Scanner;
public class Pairsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("enetr no of test cases\n");
           int t=sc.nextInt();
           for(int k=0;k<t;k++){
                
            int n=sc.nextInt(); 
            int[] a=new int[n];
          
            //System.out.println("enetr array elements:\n");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            
             
             //System.out.println("ENTER SUM:");
             int x=sc.nextInt();
             int count=0;
                for(int i=0;i<n-1;i++){
                        for(int j=i+1;j<n;j++){
                         if((a[i]+a[j])==x){
                             count+=1;
                            }
                        }    
                }
             System.out.println("no of such pairs which give the sum are : "+count);
            }

        }
}