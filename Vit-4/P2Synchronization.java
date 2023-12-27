//program-2 Synchronization
class Customer{
    synchronized void multi(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}

public class P2Synchronization {
    public static void main(String[] args) {
        Customer obj=new Customer();
         T1 t1=new T1(obj);
        T2 t2=new T2(obj);
        t1.start();
        t2.start();
    }
}

class T1 extends Thread{
    Customer t;
    T1(Customer t){  
     this.t=t;  
    }  
    public void run(){
       t.multi(100);
    }
}
class T2 extends Thread{
    Customer t;
    T2(Customer t){  
     this.t=t;  
    }  
    public void run(){
       t.multi(15);
    }
}
