package com.company;

/**
 * Created by dubo on 16/9/11.
 */
public class Factor {
    private int x;
    public Factor(int x){
        this.x=x;
    }
    public void factor(){
        int result=1;
        for(int i=x;i>=1;i--){
            result=result*i;
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        Factor f=new Factor(4);
        f.factor();
    }
}
