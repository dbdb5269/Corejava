package com.company;

/**
 * Created by dubo on 16/9/12.
 */
public class Perfect {
    public static void main(String[] args){
        // 1000ÒÔÄÚÇóÍêÊý
        for(int i=1;i<1000;i++){
            int sum = 0;
            // Ñ­»·ÇóÒò×Ó,²¢ÇÒÀÛ¼Ó
            for(int j=1;j<=i/2;j++){
                if(i%j==0)
                    sum += j;
            }
            //ÅÐ¶ÏÒò×ÓÖ®ºÍÊÇ·ñµÈÓÚÊý×Ö±¾Éí,ÒªÊÇ·ûºÏÊä³ö
            if(sum==i)
                System.out.print(sum + " ");
        }
        System.out.println();
    }

}
