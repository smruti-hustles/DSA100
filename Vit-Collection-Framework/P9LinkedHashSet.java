
import java.util.*;

public class P9LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> h=new LinkedHashSet<>();
        h.add(20);
        h.add(-1);
        h.add(1000);
        h.add(0);
        h.add(1000);
        System.out.println(h);// [20, -1, 1000, 0] it prints the element in the insertion order
        System.out.println(h.size());//4
        System.out.println(h.isEmpty()); //false
        System.out.println(h.contains(20)); //true
        //Only gives unique elements 
        //Order is insertion order
        h.add(null);
        System.out.println(h);//[20, -1, 1000, 0, null]
        //only one null value is allowed
        //Collections.sort(h);
        //Sorting LinkedHashSet is not possible

        ArrayList<Integer> a=new ArrayList<>();
        a.add(45);
        a.add(-89);
        h.addAll(a);
        System.out.println(h);//[20, -1, 1000, 0, null, 45, -89]
        //we can add ArrayList or another LinkedHashSet or any other Collections to it
        h.removeAll(a);
        System.out.println(h); //[20, -1, 1000, 0, null]

        h.remove(20); //since no order is followed in LinkedHashSet we can pass only the ele to be removed to remove(), not the index
        System.out.println(h); //[-1, 1000, 0, null]

        for(Integer i:h){
            System.out.println(i);
        }
        /*
         -1
         1000
         0
         null
         */

       h.clear();
       System.out.println(h); //[]

    }
}
