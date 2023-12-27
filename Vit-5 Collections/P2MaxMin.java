//max min element in the list
import java.util.*;
public class P2MaxMin {
    public static void main(String[] args) {
    	LinkedList<Integer> l=new LinkedList<>();
        l.add(2);
        l.add(4);
        l.add(-7);
        l.add(-10);
        l.add(0);
        l.add(40);
        Collections.sort(l);
        System.out.println("min element :"+l.getFirst());
        System.out.println("Max element :"+l.getLast());
      	}
}
