//Assignment-3
//Intersection of Arrays
import java.util.*;
public class Intersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("enetr no of test cases\n");
           int t=sc.nextInt();
           for(int k=0;k<t;k++){
                
            int n=sc.nextInt(); 
            int[] a=new int[n];
             //System.out.println("enetr 1st array elements:\n");
             
              for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            
             int m=sc.nextInt(); 
            int[] b=new int[m];
            //System.out.println("enetr 2nd array elements:\n");
               for(int i=0;i<m;i++){
                b[i]=sc.nextInt();
            }
            
            ArrayList<Integer> d = new ArrayList<>();
          
             for(int i=0;i<n;i++){
                        for(int j=0;j<m;j++){
                         if(a[i]==b[j]){
                             int x=a[i];
                             if(!d.contains(a[i])){
                             d.add(x);
                                }
                            }
                          
                        }   
                   }
            System.out.print(d);
            }

        }
}