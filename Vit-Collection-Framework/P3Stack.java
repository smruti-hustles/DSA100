import java.util.*;
public class P3Stack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(100);
        s.push(200);
        s.push(300);
        s.push(400);
        s.push(null);
        s.push(400);
        s.push(500);
        
        System.out.println(s);//[100, 200, 300, 400, null, 400, 500]
        System.out.println(s.peek()); //500 //it gives top ele in the stack   
        int a=s.pop();// remos the top ele in the stact ie.. the ele that we have push last into the stack
        System.out.println(a);//500
        System.out.println(s);//[100, 200, 300, 400, null, 400]
       
        System.out.println(s.peek());//400
        System.out.println(s.empty());//false //it gives whether stack is empty or not

         System.out.println(s.search(200)); //5
        System.out.println(s.search(400)); //1
        /*
         * Here the search() method starts searching from the top 
         * 1-400 top of the stack therefore s.search(400)=>1
         * 2-null
         * 3-400
         * 4-300
         * 5-200   therefore s.search(200)=>5
         * 6-100
         */       
         System.out.println(s.search(1)); //-1 since element 1 is not present it returns -1 
        
                
    }
}
