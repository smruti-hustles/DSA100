import java.util.*;
public class P8TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> h=new TreeSet<>();
        h.add(20);
        h.add(-1);
        h.add(1000);
        h.add(0);
        h.add(1000);
        h.add(78);
        h.add(900);
        System.out.println(h);// [-1, 0, 20, 78, 900, 1000] // gives unique elements in a sorted format
        System.out.println(h.size());//6
        System.out.println(h.isEmpty()); //false
        System.out.println(h.contains(20)); //true
        //Only gives unique elements 
        //sorted order is followed
        //h.add(null);       
        //does not allow any null value 
        //Collections.sort(h);
        //it is already sorted
        ArrayList<Integer> a=new ArrayList<>();
        a.add(45);
        a.add(-89);
        h.addAll(a);
        System.out.println(h);//[-89, -1, 0, 20, 45, 78, 900, 1000] sorted order is followed
        //we can add ArrayList or any other Collections to it
        h.removeAll(a);
        System.out.println(h); //[-1, 0, 20, 78, 900, 1000]

        h.remove(20); // we can pass only the ele to be removed to remove(), not the index
        System.out.println(h); //[-1, 0, 78, 900, 1000]
        h.remove(1);//since ele 1 is not present it doesn't remove anything
        System.out.println(h);//[-1, 0, 78, 900, 1000]

        for(Integer i:h){
            System.out.println(i);
        }
        /*
         -1
         0
         78
         900
         1000
         */

       h.clear();
       System.out.println(h); //[]


       TreeSet<String> t=new TreeSet<>();
       t.add("Smruti");
       t.add("Shruti");
       t.add("Kartikeya");
       t.add("Rama");
       t.add("Avishka");
       t.add("avishka");
       System.out.println(t); //[Avishka, Kartikeya, Rama, Shruti, Smruti, avishka]
       System.out.println(t.last()); //avishka
       System.out.println(t.first());//Avishka       

       t.clear();
       System.out.println(t);

       TreeSet<Integer> l=new TreeSet<>();
       l.add(78);
       l.add(99);
       l.add(62);
       l.add(23);
       l.add(-9);
       l.add(-99);
       l.add(569);
       l.add(234);
       System.out.println(l);//[-99, -9, 23, 62, 78, 99, 234, 569]
       System.err.println(l.higher(10));//23 returns ele which is slightly higher than 10 i.e.,23
       System.err.println(l.lower(10));//9 returns ele which is slightly lower than 10 i.e.,9
       System.out.println(l.pollFirst()); //-99 removes and gives the first/ lowest ele
       System.out.println(l.pollLast());  //567 removes and gives the last/ highest ele
        System.out.println(l); //[-9, 23, 62, 78, 99, 234]

       for(Integer i:l){
        System.out.println(i);
       }
       /*
        -9
        23
        62
        78
        99
        234
        */

    }
}

    

