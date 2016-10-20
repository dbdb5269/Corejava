package com.company;

public class Main {
    public static int binarySearch(Integer[] srcArry,int des){
        int low=0;
        int high=srcArry.length-1;
        while ((low<=high)&&(low<=srcArry.length-1)&&(high<=srcArry.length-1)){
            int middle=(high+low)>>1;
            if(des==srcArry[middle]){
                return middle;
            }else if(des<srcArry[middle]){
                high=middle-1;
            }else {
                low=middle+1;
            }
        }
        return -1;
    }
    public static void phello(){
        System.out.print("hello world");
    }
    public static void main(String[] args) {
        Main binarysearch=new Main();
        binarysearch.phello();
    }

}
