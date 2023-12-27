import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class P2stringCompression{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
     LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(hm.get(ch)!=null){
            hm.put(ch,hm.get(ch)+1);
        }
        else{
            hm.put(ch,1);
        }
     }
     StringBuilder sb=new StringBuilder();
     for(Entry<Character,Integer> e : hm.entrySet()){
        sb.append(e.getKey());
        sb.append(e.getValue());
     }
      System.out.println(sb.toString());
    }
}