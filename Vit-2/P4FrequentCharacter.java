//mmmmmost frequent character
//most frequent word
//most frequent sentence
//second most frequent and second most least frequent character
// given a character we have to findout its fequency✔😊
import java.util.*;


public class P4FrequentCharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr String :");
        String s=sc.nextLine();
        System.out.println("Enetr character :");
        String c=sc.next();
        int total1=s.length();
        int total2=s.replace(c,"").length();
        int total=total1-total2;
        System.out.println("frequency of "+c+" is : "+total);

    }
}
