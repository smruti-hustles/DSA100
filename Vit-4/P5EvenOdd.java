/*
//Program-5 Even and odd in increasing order
public class P5EvenOdd {
    public static void main(String[] args) {
       EvenOdd ob=new EvenOdd();
      new Thread(){
            public void run(){
                ob.odd();
               }           
        }.start();
        new Thread(){
            public void run(){
             ob.even();
            }
        }.start();
    }
}

class EvenOdd {
    boolean isOddTurn = true;
    synchronized void odd() {
        for (int i = 1; i <= 100; i += 2) {
            try {
                while (!isOddTurn) {
                    wait();
                }

                Thread.sleep(500);
                System.out.println(i);

                isOddTurn = false;
                notify();
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    synchronized void even() {
        for (int i = 2; i <= 100; i += 2) {
            try {
                while (isOddTurn) {
                    wait();
                }

                Thread.sleep(500);
                System.out.println(i);

                isOddTurn = true;
                notify();
            } 
            catch (Exception e) {
                 System.out.println(e);
            }
        }
    }
}
*/
