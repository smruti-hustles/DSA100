
import java.util.*;

public class P5PriorityQueue{

    public static void main(String[] args) {
        // Creating a PriorityQueue
        PriorityQueue<String> pq = new PriorityQueue<>();

        // Adding elements using offer() and add()
        pq.offer("avishka");
        pq.offer("smruti");
        pq.add("pooja");
        System.out.println("PriorityQueue after additions: " + pq);  // [avishka, smruti, pooja]

        
        // Checking the size of the PriorityQueue
        System.out.println("Size: " + pq.size());  // 3

        // Checking if the PriorityQueue contains an element
        System.out.println("Contains 'pooja': " + pq.contains("pooja"));  // true
        System.out.println("Contains 'Smruti': " + pq.contains("Smruti"));  // false (case-sensitive)
        System.out.println("Contains 'rohit': " + pq.contains("rohit"));  // false

        // Retrieving elements using peek(), element()
        System.out.println("Peek: " + pq.peek());  // avishka (head of the queue) and doesn't remove the element but doesn't remove them
        System.out.println("Element: " + pq.element());  // avishka (head of the queue)
        System.out.println("PriorityQueue: " + pq);  // [avishka, smruti, pooja]

        // Removing elements using remove(), poll()
        System.out.println("Remove 'smruti': " + pq.remove("smruti"));  // true
        System.out.println("Poll: " + pq.poll());  // avishka (removes and returns the head)
        System.out.println("PriorityQueue after removals: " + pq);  // [pooja]

        // Adding more elements
        pq.add("elvish");
        pq.add("dhruv");
        pq.add("popoyee");
        System.out.println("PriorityQueue after more additions: " + pq);  // [dhruv, pooja, elvish, popoyee]

        // Iterating over the elements using an iterator
        System.out.print("Elements in PriorityQueue: ");
        Iterator<String> iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();  // dhruv pooja elvish popoyee

        for(String i: pq){
            System.out.println(i);
        }
        /*
        dhruv
        pooja
        elvish
        popoyee
         */

        // Checking if PriorityQueue is empty
        System.out.println("Is PriorityQueue empty? " + pq.isEmpty());  // false

        // Clearing the PriorityQueue
        pq.clear();
        System.out.println("PriorityQueue after clearing: " + pq);  // []

        // Checking if PriorityQueue is empty again
        System.out.println("Is PriorityQueue empty after clearing? " + pq.isEmpty());  // true
    }
}

