package com.mrdubo;

import java.util.*;

class test{
    public static void test(){
        System.out.println("world");
    }
}

public class Main extends test{

    public static void test(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        test();
    }

}

