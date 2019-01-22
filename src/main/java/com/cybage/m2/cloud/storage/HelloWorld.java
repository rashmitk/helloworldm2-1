package com.cybage.m2.cloud.storage;

/**
 * Created by rashmitr on 22/Jan/2019
 * copyright (c) Jellyfish Agency Limited. All rights reserved
 */
public class HelloWorld {

    public HelloWorld(){
        System.out.println("Creating com.cybage.m2.cloud.storage.HelloWorld Object");
    }

    public String sayHello(){
        return "Hello World !";
    }

    public static void main(String[] args) {
        HelloWorld obj = new HelloWorld();
        System.out.println(obj.sayHello());
    }
}
