import java.util.Scanner;

public class P14CommaSeparated {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
        String[] s=str.split(",");
        for (String a : s)
        System.out.println(a);
    }
}
