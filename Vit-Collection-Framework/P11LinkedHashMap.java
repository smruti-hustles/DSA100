import java.util.*;

public class P11LinkedHashMap {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();

        // Adding elements using put()
        lm.put("avishka", 1);
        lm.put("smruti", 2);
        lm.put("pooja", 3);
        System.out.println("LinkedHashMap after additions: " + lm);  // {avishka=1, smruti=2, pooja=3}
        // Order is preserved (insertion order).

        // Checking the size of the LinkedHashMap
        System.out.println("Size: " + lm.size());  // Size: 3

        // Checking if the LinkedHashMap contains a key or value
        System.out.println("Contains key 'pooja': " + lm.containsKey("pooja"));  // true
        System.out.println("Contains key 'Smruti': " + lm.containsKey("Smruti"));  // false (case-sensitive)
        System.out.println("Contains value 2: " + lm.containsValue(2));  // true

        // Retrieving values using get()
        System.out.println("Value for key 'avishka': " + lm.get("avishka"));  // 1
        System.out.println("Value for key 'rohit': " + lm.get("rohit"));  // null (key doesn't exist)

        // Removing elements using remove()
        System.out.println("Remove key 'smruti': " + lm.remove("smruti"));  // 2 (returns the value associated with the key)
        System.out.println("LinkedHashMap after removal: " + lm);  // {avishka=1, pooja=3}

        // Replacing values using replace()
        lm.replace("avishka", 10);
        System.out.println("LinkedHashMap after replace: " + lm);  // {avishka=10, pooja=3}

        // Iterating over the keys using keySet()
        System.out.print("Keys in LinkedHashMap: ");
        for (String key : lm.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
        /*
         avishka pooja
         */

        // Iterating over the values using values()
        System.out.print("Values in LinkedHashMap: ");
        for (Integer value : lm.values()) {
            System.out.print(value + " ");
        }
        System.out.println();
        /*
         10 3
         */

        // Iterating over the elements using entrySet()
        System.out.print("Elements in LinkedHashMap: ");
        for (Map.Entry<String, Integer> e : lm.entrySet()) {
            System.out.print(e.getKey() + "=" + e.getValue() + " ");
        }
        System.out.println();  // avishka=10 pooja=3

        // Checking if LinkedHashMap is empty
        System.out.println("Is LinkedHashMap empty? " + lm.isEmpty());  // false

        // Clearing the LinkedHashMap
        lm.clear();
        System.out.println("LinkedHashMap after clearing: " + lm);  // {}

        // Checking if LinkedHashMap is empty again
        System.out.println("Is LinkedHashMap empty after clearing? " + lm.isEmpty());  // true
    }
}
