import java.util.*;
public class P12MaxMinFrequentCharacter {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		HashMap<Character, Integer> hm =  new HashMap<>();//because in character we are going to take each character of the String and in integer we are going to store its values.
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(hm.containsKey(ch)){   // if the character is present in hashmap we are incrementing its value
		        int of = hm.get(ch); // of- old frequency
		        int nf= of+1;        //nf - new frequency
		    }
		    else{
		        hm.put(ch,1);  //if the character is not there is hash map yet, then we are intializing its count with 1
		    }
		}
		char maxfc=str.charAt(0);
        
		for(Character c: hm.keySet()){
		    if(hm.get(c)>hm.get(maxfc))
		    maxfc=c;
		}
		System.out.println("Max occurring character is: " + maxfc);

        char minfc=str.charAt(str.length()-1);
        for(Character c: hm.keySet()){
            if(hm.get(c)<hm.get(minfc))
            minfc=c;
        }
        System.out.println("Max occurring character is: " + minfc);
	}
}




