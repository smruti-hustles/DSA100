
//Program1 - creating and starting the thread
public class P1CreateandstartnewThread {
   public static void main(String[] args) {
    T1 t1=new T1();
    T2 t2=new T2();
    t1.start();
    t2.start();
    new Thread(){
        public void run(){
          System.out.println("Hello, I am anonymus thread");  
        }
    }.start();
   }
}

class T1 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println(i);
        }
    }
}
class T2 extends Thread{
    public void run(){
        for(int i=10;i<15;i++){
            System.out.println(i);
        }
    }
}