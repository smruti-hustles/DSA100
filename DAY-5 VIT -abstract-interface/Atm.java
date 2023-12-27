interface DebitCard{
    void withdraw();
}
class Sbi implements DebitCard{
    public void withdraw(){
       System.out.println("withdraw from Sbi");
    }
}
class Hdfc implements DebitCard{
    public void withdraw(){
       System.out.println("withdraw from Hdfc");
    }
}
class Icici implements DebitCard{
    public void withdraw(){
       System.out.println("withdraw from Icici");
    }
}
public class Atm{
    public static void show(DebitCard ob){
        ob.withdraw();
    }
    public static void main(String args[]){
        Sbi a=new Sbi();
        Hdfc b=new Hdfc();
        Icici c=new Icici();
        show(a);
        show(b);
        show(c);
    }
}