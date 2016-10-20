package Thread.Account;

/**
 * Created by dubo on 16/9/27.
 */
public class AccountTest {
    public static void main(String[] args) {
        int i=0;
        MyAccount account=new MyAccount("Liming",10000);

        SeverceThread th=new SeverceThread("boy",account,10000);
        SeverceThread th2=new SeverceThread("girl",account,10000);


            th2.start();
            th.start();


        try {
            th2.join();
            th.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("account balance is " +account.getBalance());

    }
}
