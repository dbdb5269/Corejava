package Thread.Account;

import ch05.bank.Account;

/**
 * Created by dubo on 16/9/27.
 */
public class MyAccount {
    private String name;
    private double balance;
    public MyAccount(String name,int balance){
        super();
        setName(name);
        setBalance(balance);
    }
    public MyAccount(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }
    public double deposit(double amt){
        if(amt<0)
            return 0;
        double localBalance=balance;
        localBalance+=amt;
        balance=localBalance;
        return amt;
    }
    synchronized public double withdraw(double amt){

        //synchronized (this){
            if(amt<0 || amt>balance)
                return 0;
            double localBalance=getBalance();
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            localBalance-=amt;
            setBalance(localBalance);
            return amt;
      //  }


    }
}
