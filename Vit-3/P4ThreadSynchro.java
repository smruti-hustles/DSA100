public class P4ThreadSynchro {
    public static void main(String[] args) {
      final Counter c = new Counter();
        T1 t1=new T1(c);
        T2 t2=new T2(c);
       
        t1.start();
        t2.start();
        
    }
    
}
class Counter{
    int count=100;
    public synchronized void decrement(int count){
        if(this.count<count){
             System.out.println("low value");
            try{
                wait(2000);
            }
           
           catch(Exception e){
              System.out.println(count);
           }
        }
       
        this.count-=count;
      
         System.out.println("decremented");
    }
    public synchronized void increment(int count){
        this.count+=count;
        System.out.println("incremented");
    }

}
class T1 extends Thread{
    Counter c;
    
    public void run(){       
           c.decrement(10);
            }

            T1(Counter c){
                this.c=c;
            }

}
class T2 extends Thread{
     Counter c;
    public void run(){       
           c.increment(100);
            }
             T2(Counter c){
                this.c=c;
            }
}


