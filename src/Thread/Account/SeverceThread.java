package Thread.Account;



/**
 * Created by dubo on 16/9/27.
 */
public class SeverceThread extends Thread {
    private MyAccount account;
    private double amt;
    public SeverceThread(String name,MyAccount account,double amt){
        super(name);
        this.account=account;
        if(amt<0 ||amt >account.getBalance()){
            amt=0;
        }
        else {
            this.amt=amt;
        }
    }
    public void run(){
        //synchronized (account){
            double money=account.withdraw(amt);
            System.out.println(getName()+"withdraw"+money);
        //}




    }


}
