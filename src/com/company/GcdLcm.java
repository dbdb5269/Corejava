package com.company;

/**
 * Created by dubo on 16/9/12.
 */
public class GcdLcm {
    private int x;
    private int y;
    public void check(int x,int y){
        if(x<y){
            int temp=this.x;
            this.x=this.y;
            this.y=temp;

        }
    }
    public int GCD(int x,int y){
        check(x,y);

        if((x%y)!=0){
            return GCD(y,x%y);
        }else {
            return y;
        }

    }
    public void LCM(int x,int y){
        int gcd=GCD(x,y);
        System.out.println(x*y/gcd);
    }
    public static void main(String[] args){
        GcdLcm g=new GcdLcm();
        int re=g.GCD(32,24);
        System.out.println(re);
        g.LCM(32,24);

    }
}
