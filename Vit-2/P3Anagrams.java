import java.util.*;
public class P3Anagrams{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.length()!=s2.length()){
            System.out.println("Not Anagrams");
        }
        else{
        char[] p1=s1.toCharArray();
        char[] p2=s2.toCharArray(); 
        Arrays.sort(p1);
        Arrays.sort(p2);
        for(int i=0;i<p1.length;i++){
             System.out.print(p1[i]);
        }
         System.out.println();
        for(int i=0;i<p1.length;i++){
             System.out.print(p1[i]);
        }
        System.out.println();
        if(Arrays.equals(p1,p2)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams"); 
        }
     }
        
    }
}