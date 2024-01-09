package com.xworkz.exceptionhandlingapp.exceptionexamples;

import com.xworkz.exceptionhandlingapp.exceptionexamples.User.UserInfo;

public class UserExecutor {

    public void method1() {
        System.out.println("Method 1 started");
        method2();
        System.out.println("Method 1 ended");
    }
    public void method2() {
        System.out.println("Method 2 started");
        method3();
        System.out.println("Method 2 ended");
    }

    public void method3() {
        System.out.println("Method 3 started");
        try{
            method4();
        }catch (ClassNotFoundException e){
            System.out.println("handled");
        }
        System.out.println("Method 3 ended");
    }

    public void method4() throws ClassNotFoundException{
        System.out.println("Method 4 started ");
        Class.forName("com.xworkz.exceptionhandlingapp.exceptionexamples.UserExecuto");
        System.out.println("---------------------------");
        System.out.println("Method 4 ended");
    }

    public static void main(String[] args) {

        System.out.println("Main started");

        UserExecutor userExecutor = new UserExecutor();
        userExecutor.method1();

        System.out.println("Main ended");

    }
}
