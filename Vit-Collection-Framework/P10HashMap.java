import java.util.*;
public class P10HashMap {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> m=new HashMap<>();

        // Adding elements using put()
        m.put("avishka",1);
        m.put("smruti", 2);
        m.put("pooja", 3);
        System.out.println("HashMap after additions: " + m);  // {smruti=2, pooja=3, avishka=1}
        //there is no ordering on keys or values.

        // Checking the size of the HashMap
        System.out.println("Size: " + m.size());  // Size: 3

        // Checking if the HashMap contains a key or value
        System.out.println("Contains key 'pooja': " + m.containsKey("pooja"));  // true
        System.out.println("Contains key 'Smruti': " + m.containsKey("Smruti"));  // false (case-sensitive)
        System.out.println("Contains value 2: " + m.containsValue(2));  // true

        // Retrieving values using get()
        System.out.println("Value for key 'avishka': " + m.get("avishka"));  // 1
        System.out.println("Value for key 'rohit': " + m.get("rohit"));  // null (key doesn't exist)
        
        // Removing elements using remove()
        System.out.println("Remove key 'smruti': " + m.remove("smruti"));  // 2 (returns the value associated with the key)
        System.out.println("HashMap after removal: " + m);  // {pooja=3, avishka=1}

        // Replacing values using replace()
        m.replace("avishka", 10);
        System.out.println("HashMap after replace: " + m);  // {pooja=3, avishka=10}


         // Iterating over the keys using keySet()
         System.out.print("Keys in HashMap: ");
         for (String key : m.keySet()) {
             System.out.print("\n"+key);
         }
         System.out.println(); 
         /*
          pooja
          avishka
          */
 
         // Iterating over the values using values()
         System.out.print("Values in HashMap: ");
         for (Integer value : m.values()) {
             System.out.print("\n"+value);
         }
         System.out.println();  
         /*
          3 
          10
          */

         // Iterating over the elements using entrySet()
         System.out.print("Elements in HashMap: ");
         for (Map.Entry<String, Integer> e : m.entrySet()) {
             System.out.print(e.getKey() + "=" + e.getValue() + " ");
         }
         System.out.println();  // pooja=3 avishka=10  

        // Checking if HashMap is empty
        System.out.println("Is HashMap empty? " + m.isEmpty());  // false

        // Clearing the HashMap
        m.clear();
        System.out.println("HashMap after clearing: " + m);  // {}

        // Checking if HashMap is empty again
        System.out.println("Is HashMap empty after clearing? " + m.isEmpty());  // true

    }
}
