/*program-3
//locks and conditions in multithreading-1
public class P3LocksandConditionsMulti {
    public static void main(String args[]){
     final Customer ob=new Customer();
     new Thread(){
          public void run(){
            ob.withdraw(5000);
          }
     }.start();
     new Thread(){
        public void run(){
          ob.deposit(5000);
        }
   }.start();

    }
}
class Customer{
    int amt=10000;
    synchronized void withdraw(int amt){
        System.out.println("Going to withdraw");
        if(this.amt<amt){
            System.out.println("Low Balance");
             try{
                wait();
             }
             catch(Exception e){
                System.out.println(e);
             }
            }
        this.amt-=amt;
        System.out.println("withdraw successful");
        System.out.println("Balance:"+this.amt);
    }

    synchronized void deposit(int amt){
        System.out.println("Going to deposit");
        this.amt+=amt;
        System.out.println("deposit successful");
        System.out.println("Balance:"+this.amt);
        notify();
    }
}
*/
class Printer {
    synchronized void print(int n){
        for(int i=0;i<=10;i++){
            try{
                Thread.sleep(5000);
                System.out.println(i*n);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class P3LocksandConditionsMulti {
    public static void main(String[] args) {
        Printer p=new Printer();
        new Thread(){
            public void run(){
               p.print(10);
            }
        }.start();
        new Thread(){
            public void run(){
               p.print(100);
            }
        }.start();
    }
}


