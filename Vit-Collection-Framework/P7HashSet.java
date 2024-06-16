import java.util.*;

public class P7HashSet {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(20);
        h.add(-1);
        h.add(1000);
        h.add(0);
        h.add(1000);
        System.out.println(h);// [-1, 0, 20, 1000]
        System.out.println(h.size());//4
        System.out.println(h.isEmpty()); //false
        System.out.println(h.contains(20)); //true
        //Only gives unique elements 
        //Order is not followed
        h.add(null);
        System.out.println(h);//[-1, 0, null, 20, 1000]
        //only one null value is allowed
        //Collections.sort(h);
        //Sorting hashset is not possible

        ArrayList<Integer> a=new ArrayList<>();
        a.add(45);
        a.add(-89);
        h.addAll(a);
        System.out.println(h);//[-1, 0, null, 20, 1000, -89, 45]
        //we can add ArrayList or another HashSet or any other Collections to it
        h.removeAll(a);
        System.out.println(h); //[-1, 0, null, 20, 1000]

        h.remove(20); //since no order is followed in HashSet we can pass only the ele to be removed to remove(), not the index
        System.out.println(h); //[-1, 0, null, 1000]

        for(Integer i:h){
            System.out.println(i);
        }

       h.clear();
       System.out.println(h); //[]

    }
}
