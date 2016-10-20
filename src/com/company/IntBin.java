package com.company;

/**
 * Created by dubo on 16/9/9.
 */
public class IntBin {
    private int val;
    private int result;
    public IntBin(int val){
        this.val=val;
    }
    public void setZero(){
        for(int i=7;i>=0;i--){
            this.val=this.val & (~(1 << i));
        }
        System.out.println("清除后8位后="+this.val);
    }
    public void display(){
        for(int i=31;i>=0;i--){
            int result=(val >> i ) & 1;
            System.out.print(result);

        }
        System.out.println();
    }
    public static void main(String[] args){
        IntBin i=new IntBin(255);
        i.display();
        i.setZero();
        i.display();
        IntBin i2=new IntBin(0);
        i2.display();
        i2.setBin();
        i2.display();
    }
    public void setBin(){
        for(int i=15;i>=0;i--){
            this.val=this.val | (1 << i);
        }
        System.out.println("置前16位为="+this.val);
    }

}
