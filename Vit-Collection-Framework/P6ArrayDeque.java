/*/
- ArrayDeque andArrayDeque are both implementations of the Deque interface.

- ArrayDeque is more efficient for queue operations, whileArrayDeque has the flexibility to be used as a list or queue.

- ArrayDeque cannot contain null elements;ArrayDeque can.

- Memory efficiency and performance vary between the two, influencing their application.
*/

import java.util.*;

public class P6ArrayDeque {

    public static void main(String[] args) {
       ArrayDeque<String> ll = new ArrayDeque<>();
       
       ll.offer("avishka");
       ll.offer("smruti");
       ll.offer("pooja");
       System.out.println(ll);   // [avishka, smruti, pooja]
       System.out.println(ll.size());  // 3
       System.out.println(ll.contains("pooja"));  // true
       System.out.println(ll.contains("Smruti"));  // false (case-sensitive)
       System.out.println(ll.contains("rohit"));  // false

       ll.add("elvish");
       ll.addFirst("dhruv");
       ll.addLast("popoyee");
       System.out.println(ll);  // [dhruv, avishka, smruti, pooja, elvish, popoyee]

       ll.offerFirst("madhuri");
       ll.offerLast("moyemoye");
       System.out.println(ll);  // [madhuri, dhruv, avishka, smruti, pooja, elvish, popoyee, moyemoye]

       System.out.println(ll.peek());  // madhuri
       System.out.println(ll.peekFirst());  // madhuri
       System.out.println(ll.peekLast());  // moyemoye
       System.out.println(ll);  // [madhuri, dhruv, avishka, smruti, pooja, elvish, popoyee, moyemoye]

       System.out.println(ll.getFirst());  // madhuri
       System.out.println(ll.getLast());  // moyemoye
       System.out.println(ll);  // [madhuri, dhruv, avishka, smruti, pooja, elvish, popoyee, moyemoye]

       System.out.println(ll.remove("elvish"));  // true
       System.out.println(ll.remove());  // madhuri
       System.out.println(ll.removeFirst());  // dhruv
       System.out.println(ll.removeLast());  // moyemoye
       System.out.println(ll);  // [avishka, smruti, pooja, popoyee]

       System.out.println(ll.poll());  // avishka
       System.out.println(ll.pollFirst());  // smruti
       System.out.println(ll.pollLast());  // popoyee
       System.out.println(ll);  // [pooja]

       ArrayDeque<String> mm = new ArrayDeque<>();
       mm.offer("avishka");
       mm.offer("smruti");
       System.out.println(mm);  // [avishka, smruti]

       System.out.println(ll.containsAll(mm));  // false

       ll.addAll(mm);
       System.out.println(ll);  // [pooja, avishka, smruti]
       ll.removeAll(mm);
       System.out.println(ll);  // [pooja]

       
        for (String i : ll) {
           System.out.println(i);
        }

       ll.clear();
       System.out.println(ll.isEmpty());  // true
    }
}
