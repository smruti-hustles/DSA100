import java.util.*;
public class P1ArrayList{
    public static void main(String[] args) {
       ArrayList<Integer> l=new ArrayList<>();
       l.add(210);
       l.add(20);
       l.add(3330);
       System.out.println(l); //[210, 20, 3330]
       Collections.sort(l); //
        System.out.println(l);//[20, 210, 3330]
       //It follows Insertion ordrer
       //It allows null values as well
       //l.add(); this is wrong this is not null but empty
       l.add(null);
       l.add(30);//allows duplicates
       l.add(100);
       l.add(2,346); //inserting element 346 in the particular index 2
       System.out.println(l);//[20, 210, 346, 3330, null, 30, 100]
       l.set(2,300); //now the value at index 2 has changed to 300
       
    
       System.out.println(l); //[20, 210, 300, 3330, null, 30, 100]

       //we can also add a new list using addAll()
       ArrayList<Integer> l1=new ArrayList<>();
       l1.add(101);
       l1.add(2022);
       l1.add(3044);
       l.addAll(l1);
       System.out.println(l);//[20, 210, 300, 3330, null, 30, 100, 101, 2022, 3044]
       System.out.println(l.size());//no of ele in the list == 10
       System.out.println(l.get(3));//i wil give the ele at index 3 == 3330
       
       //removing ele with the help of index
       int a=l.remove(1);//it will remove the ele at index 1 ==210
       System.out.println(l); //[20, 300, 3330, null, 30, 100, 101, 2022, 3044] the remaining ele
       System.out.println(a); //210 the removed ele
       //we can also remove the ele by their values
       l.remove(Integer.valueOf(2022));
       System.out.println(l); //[20, 300, 3330, null, 30, 100, 101, 3044]
       l.removeAll(l1);//it removes the the second list l1 which we have inserted in our list l
       System.out.println(l); //[20, 300, 3330, null, 30, 100]
     
      // l.clear();//it removes all the ele from the list
       //System.out.println(l);//[]

       //if we want to update an ele 
       l.set(1,62); //at 1st idex it will updae the value to 62
       System.out.println(l); //[20, 62, 3330, null, 30, 100]

       //we can check if a particular ele is present or not
       System.out.println(l.contains(62));//true
       System.out.println(l.contains(2023));//false
       System.out.println(l.isEmpty()); // false



       System.out.println(l); //This will return a list [20, 62, 3330, null, 30, 100]
       for(int i=0;i<l.size();i++){
        System.out.println(l.get(i));//this will print the list ele one by one lite iteration
       }
       for(Integer n:l){
        System.out.println(n); // This also iterates the list el but it is more easier
       }
       //apart from these we can also use Iterator class
       Iterator<Integer> it=l.iterator();
       while(it.hasNext()){
        System.out.println(it.next());
       }

       //we can also clone our aarraylist
        //(shallow copy so changes made in it won't effect the original one)
        ArrayList<Integer> cl=(ArrayList<Integer>)l.clone();
        System.out.println(cl); //[20, 62, 3330, null, 30, 100]
        l.add(10);
        l.add(10);
        l.add(10);
        System.out.println(l); //[20, 62, 3330, null, 30, 100, 10, 10, 10]
        System.out.println(l.indexOf(10)); //6 gives first index of 10
        System.out.println(l.lastIndexOf(10)); //8 gives last index of 10
        /******************very very imp**************************** */
        //Collections.sort(l);
        //System.out.println(l); when null ele is there we cannot sort it
        System.out.println(l.subList(3,5)); //gives subList i.e ele in 3rd and 4th index
        //[null, 30]

 l.clear();//it removes all the ele from the list
       System.out.println(l);//[]
       System.out.println(l.isEmpty()); // true
       
       
    }
}

