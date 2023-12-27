import java.util.*;
public class P13NoOfWords {
        public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
        String[] s=str.split(" ");
        for (String a : s)
        System.out.println(a);
        System.out.println("No of words in the string are: " + s.length);

    }
}

