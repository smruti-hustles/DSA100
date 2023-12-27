//finding frequency of ele
import java.util.*;
public class P4Frequency {
    public static void main(String[] args) {
	    int a[]={1,2,3,4,56,7,87,81,1,2,3,4,1,2,3,4,56};
    	HashSet<Integer> l=new HashSet<>();
        for(int n:a){
            l.add(n);
        }
        for(int i:l){
            int freq=0;
            for(int j:a){
                if(i==j)
                freq++;
            }
              System.out.println(i +":"+freq);
        }           
      	}
}
