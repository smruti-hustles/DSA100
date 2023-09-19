//Assignment-5
//Triplet sum
import java.util.Scanner;
public class Tripletsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("enetr no of test cases\n");
           int t=sc.nextInt();
           for(int z=0;z<t;z++){
                
            int n=sc.nextInt(); 
            int[] a=new int[n];
          
            //System.out.println("enetr array elements:\n");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            
             
             //System.out.println("ENTER SUM:");
             int x=sc.nextInt();
             int count=0;
                 for(int i=0;i<n-2;i++){
                        for(int j=i+1;j<n-1;j++){
                            for(int k=j+1;k<n;k++){
                         if((a[i]+a[j]+a[k])==x){
                             count+=1;
                            }
                        }
                    }
                }
             System.out.println("no of such triplets which give the sum are : "+ count);
            }

        }
}