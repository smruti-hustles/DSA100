//producer consumer
//program-4

class Q{
    boolean value=false;
    int num;//we are just taking a number 
    //then let's take 2 methods. 
   public synchronized void put(int num){//it puts  the value
         while(value){
             try{wait();}catch(Exception e){}
         }
       System.out.println("put:"+num);
       this.num=num;
       value=true;
       notify();
   }
   public synchronized void get(){//it fetches the value
   while(!value){
             try{wait();}catch(Exception e){}
         }
       System.out.println("get"+num);
       value=false;
       notify();
   }
    
}
//now let's create 2 threads
public class P4ProducerConsumer
{
	public static void main(String[] args) {
	    Q ob=new Q();
	Producer p=new Producer(ob);
	Consumer c=new Consumer(ob);
	p.start();
	c.start();
	}
}
class Producer extends Thread{
    Q t;
    Producer(Q t){
        this.t=t;
    }
    public void run(){
        int i=0;
        while(true){
            t.put(i++);
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
class Consumer extends Thread{
    Q t;
    Consumer(Q t){
        this.t=t;
    }
    public void run(){
         while(true){
            t.get();
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}