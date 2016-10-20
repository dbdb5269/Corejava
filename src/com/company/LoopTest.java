package com.company;

/**
 * Created by dubo on 16/9/9.
 */
public class LoopTest {
    private int result=1;
    public void whileloop(){

        int i=2;

        while (i<=10){
            result=result*i;
            i++;
        }

    }
    public void forloop(){
        for(int i=2;i<=10;i++){
            result=result*i;
        }
    }
    public void doloop(){
        int i=2;
        do{
            result=result*i;
            i++;
        }while (i<=10);
    }
    public void dispaly(){
        System.out.println(result);
    }
    public static void main(String[] args){
        LoopTest w =new LoopTest();
        LoopTest w2 =new LoopTest();
        LoopTest w3 =new LoopTest();
        w.whileloop();
        w.dispaly();
        w2.forloop();
        w2.dispaly();
        w3.doloop();
        w3.dispaly();
    }
}
