//remove duplicates from the list

import java.util.*;
import java.io.*;

public class P3RemoveDuplicates {
    public static void main(String[] args)throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many elements you want to add to take: ");
        int n = Integer.parseInt(in.readLine());
        System.out.println("enter numbers : ");
        
            LinkedHashSet<Integer> l=new LinkedHashSet<>();
            for (int i = 0; i < n; i++) {
               l.add(Integer.parseInt(in.readLine()));
            }
    
            System.out.println("ELements are :"+l);

            System.out.println("using iterator");
            Iterator<Integer> i=l.iterator();
            while(i.hasNext()){
            System.out.print(i.next()+" ,");
            }
       
              }
}
