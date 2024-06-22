import java.util.*;

public class P12TreeMap {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<String, Integer> tm = new TreeMap<>();

        // Adding elements using put()
        tm.put("avishka", 1);
        tm.put("smruti", 2);
        tm.put("pooja", 3);
        System.out.println("TreeMap after additions: " + tm);  // {avishka=1, pooja=3, smruti=2}
        // Sorted order (natural ordering of keys).

        // Checking the size of the TreeMap
        System.out.println("Size: " + tm.size());  // Size: 3

        // Checking if the TreeMap contains a key or value
        System.out.println("Contains key 'pooja': " + tm.containsKey("pooja"));  // true
        System.out.println("Contains key 'Smruti': " + tm.containsKey("Smruti"));  // false (case-sensitive)
        System.out.println("Contains value 2: " + tm.containsValue(2));  // true

        // Retrieving values using get()
        System.out.println("Value for key 'avishka': " + tm.get("avishka"));  // 1
        System.out.println("Value for key 'rohit': " + tm.get("rohit"));  // null (key doesn't exist)

        // Removing elements using remove()
        System.out.println("Remove key 'smruti': " + tm.remove("smruti"));  // 2 (returns the value associated with the key)
        System.out.println("TreeMap after removal: " + tm);  // {avishka=1, pooja=3}

        // Replacing values using replace()
        tm.replace("avishka", 10);
        System.out.println("TreeMap after replace: " + tm);  // {avishka=10, pooja=3}

        // Iterating over the keys using keySet()
        System.out.print("Keys in TreeMap: ");
        for (String key : tm.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
        /*
         avishka pooja
         */

        // Iterating over the values using values()
        System.out.print("Values in TreeMap: ");
        for (Integer value : tm.values()) {
            System.out.print(value + " ");
        }
        System.out.println();
        /*
         10 3
         */

        // Iterating over the elements using entrySet()
        System.out.print("Elements in TreeMap: ");
        for (Map.Entry<String, Integer> e : tm.entrySet()) {
            System.out.print(e.getKey() + "=" + e.getValue() + " ");
        }
        System.out.println();  // avishka=10 pooja=3

        // Checking if TreeMap is empty
        System.out.println("Is TreeMap empty? " + tm.isEmpty());  // false

        // Clearing the TreeMap
        tm.clear();
        System.out.println("TreeMap after clearing: " + tm);  // {}

        // Checking if TreeMap is empty again
        System.out.println("Is TreeMap empty after clearing? " + tm.isEmpty());  // true
    }
}
